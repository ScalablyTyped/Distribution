package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EducationStudent extends StObject {
  
  // Birth date of the student.
  var birthDate: js.UndefOr[NullableOption[String]] = js.native
  
  // ID of the student in the source system.
  var externalId: js.UndefOr[NullableOption[String]] = js.native
  
  // The possible values are: female, male, other, unknownFutureValue.
  var gender: js.UndefOr[NullableOption[EducationGender]] = js.native
  
  // Current grade level of the student.
  var grade: js.UndefOr[NullableOption[String]] = js.native
  
  // Year the student is graduating from the school.
  var graduationYear: js.UndefOr[NullableOption[String]] = js.native
  
  // Student Number.
  var studentNumber: js.UndefOr[NullableOption[String]] = js.native
}
object EducationStudent {
  
  @scala.inline
  def apply(): EducationStudent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationStudent]
  }
  
  @scala.inline
  implicit class EducationStudentMutableBuilder[Self <: EducationStudent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBirthDate(value: NullableOption[String]): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthDateNull: Self = StObject.set(x, "birthDate", null)
    
    @scala.inline
    def setBirthDateUndefined: Self = StObject.set(x, "birthDate", js.undefined)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setGender(value: NullableOption[EducationGender]): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderNull: Self = StObject.set(x, "gender", null)
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setGrade(value: NullableOption[String]): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradeNull: Self = StObject.set(x, "grade", null)
    
    @scala.inline
    def setGradeUndefined: Self = StObject.set(x, "grade", js.undefined)
    
    @scala.inline
    def setGraduationYear(value: NullableOption[String]): Self = StObject.set(x, "graduationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraduationYearNull: Self = StObject.set(x, "graduationYear", null)
    
    @scala.inline
    def setGraduationYearUndefined: Self = StObject.set(x, "graduationYear", js.undefined)
    
    @scala.inline
    def setStudentNumber(value: NullableOption[String]): Self = StObject.set(x, "studentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentNumberNull: Self = StObject.set(x, "studentNumber", null)
    
    @scala.inline
    def setStudentNumberUndefined: Self = StObject.set(x, "studentNumber", js.undefined)
  }
}
