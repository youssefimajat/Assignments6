package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        Student s1 = new Student(110001,"Dave", LocalDate.of(1951,11,18));
        Student s2 = new Student(110002,"Anna", LocalDate.of(1990,12,7));
        Student s3 = new Student(110003,"Erica", LocalDate.of(1974,1,31));
        Student s4 = new Student(110004,"Carlos", LocalDate.of(2009,8,22));
        Student s5 = new Student(110005,"Bob", LocalDate.of(1990,3,5));
        ArrayList list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
       // System.out.println(list.toString());
        printListOfStudents(list);
    }
    public static void printListOfStudents(ArrayList<Student> list){
        list.stream().sorted((x,y)->x.getName().compareTo(y.getName())).forEach(input-> {
            System.out.println(input);
        });
    }

    public static void getListOfPlatinumAlumniStudent(ArrayList<Student> list){
        list.stream().filter(x->x.getDateOfAdmission().plusYears(30).isBefore(LocalDate.now()))
                .forEach(input-> {
                    System.out.println(input);
                });

    }

}
