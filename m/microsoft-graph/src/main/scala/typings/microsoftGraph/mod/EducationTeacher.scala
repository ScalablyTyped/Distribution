package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EducationTeacher extends js.Object {
  
  // ID of the teacher in the source system.
  var externalId: js.UndefOr[NullableOption[String]] = js.native
  
  // Teacher number.
  var teacherNumber: js.UndefOr[NullableOption[String]] = js.native
}
object EducationTeacher {
  
  @scala.inline
  def apply(): EducationTeacher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationTeacher]
  }
  
  @scala.inline
  implicit class EducationTeacherOps[Self <: EducationTeacher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setExternalIdNull: Self = this.set("externalId", null)
    
    @scala.inline
    def setTeacherNumber(value: NullableOption[String]): Self = this.set("teacherNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeacherNumber: Self = this.set("teacherNumber", js.undefined)
    
    @scala.inline
    def setTeacherNumberNull: Self = this.set("teacherNumber", null)
  }
}
