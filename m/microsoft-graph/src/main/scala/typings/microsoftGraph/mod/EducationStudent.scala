package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationStudent extends StObject {
  
  // Birth date of the student.
  var birthDate: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ID of the student in the source system.
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The possible values are: female, male, other, unknownFutureValue.
  var gender: js.UndefOr[NullableOption[EducationGender]] = js.undefined
  
  // Current grade level of the student.
  var grade: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Year the student is graduating from the school.
  var graduationYear: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Student Number.
  var studentNumber: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationStudent {
  
  inline def apply(): EducationStudent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationStudent]
  }
  
  extension [Self <: EducationStudent](x: Self) {
    
    inline def setBirthDate(value: NullableOption[String]): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    inline def setBirthDateNull: Self = StObject.set(x, "birthDate", null)
    
    inline def setBirthDateUndefined: Self = StObject.set(x, "birthDate", js.undefined)
    
    inline def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setGender(value: NullableOption[EducationGender]): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderNull: Self = StObject.set(x, "gender", null)
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setGrade(value: NullableOption[String]): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
    
    inline def setGradeNull: Self = StObject.set(x, "grade", null)
    
    inline def setGradeUndefined: Self = StObject.set(x, "grade", js.undefined)
    
    inline def setGraduationYear(value: NullableOption[String]): Self = StObject.set(x, "graduationYear", value.asInstanceOf[js.Any])
    
    inline def setGraduationYearNull: Self = StObject.set(x, "graduationYear", null)
    
    inline def setGraduationYearUndefined: Self = StObject.set(x, "graduationYear", js.undefined)
    
    inline def setStudentNumber(value: NullableOption[String]): Self = StObject.set(x, "studentNumber", value.asInstanceOf[js.Any])
    
    inline def setStudentNumberNull: Self = StObject.set(x, "studentNumber", null)
    
    inline def setStudentNumberUndefined: Self = StObject.set(x, "studentNumber", js.undefined)
  }
}
