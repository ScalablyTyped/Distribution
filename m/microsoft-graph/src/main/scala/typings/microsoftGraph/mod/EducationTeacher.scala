package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationTeacher extends StObject {
  
  // ID of the teacher in the source system.
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Teacher number.
  var teacherNumber: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationTeacher {
  
  @scala.inline
  def apply(): EducationTeacher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationTeacher]
  }
  
  @scala.inline
  implicit class EducationTeacherMutableBuilder[Self <: EducationTeacher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setTeacherNumber(value: NullableOption[String]): Self = StObject.set(x, "teacherNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeacherNumberNull: Self = StObject.set(x, "teacherNumber", null)
    
    @scala.inline
    def setTeacherNumberUndefined: Self = StObject.set(x, "teacherNumber", js.undefined)
  }
}
