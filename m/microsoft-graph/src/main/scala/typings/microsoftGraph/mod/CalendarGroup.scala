package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarGroup extends Entity {
  
  // The calendars in the calendar group. Navigation property. Read-only. Nullable.
  var calendars: js.UndefOr[NullableOption[js.Array[Calendar]]] = js.native
  
  /**
    * Identifies the version of the calendar group. Every time the calendar group is changed, ChangeKey changes as well. This
    * allows Exchange to apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[NullableOption[String]] = js.native
  
  // The class identifier. Read-only.
  var classId: js.UndefOr[NullableOption[String]] = js.native
  
  // The group name.
  var name: js.UndefOr[NullableOption[String]] = js.native
}
object CalendarGroup {
  
  @scala.inline
  def apply(): CalendarGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarGroup]
  }
  
  @scala.inline
  implicit class CalendarGroupOps[Self <: CalendarGroup] (val x: Self) extends AnyVal {
    
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
    def setCalendarsVarargs(value: Calendar*): Self = this.set("calendars", js.Array(value :_*))
    
    @scala.inline
    def setCalendars(value: NullableOption[js.Array[Calendar]]): Self = this.set("calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    
    @scala.inline
    def setCalendarsNull: Self = this.set("calendars", null)
    
    @scala.inline
    def setChangeKey(value: NullableOption[String]): Self = this.set("changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeKey: Self = this.set("changeKey", js.undefined)
    
    @scala.inline
    def setChangeKeyNull: Self = this.set("changeKey", null)
    
    @scala.inline
    def setClassId(value: NullableOption[String]): Self = this.set("classId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassId: Self = this.set("classId", js.undefined)
    
    @scala.inline
    def setClassIdNull: Self = this.set("classId", null)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
