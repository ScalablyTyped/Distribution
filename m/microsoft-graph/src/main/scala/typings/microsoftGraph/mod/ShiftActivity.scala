package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShiftActivity extends js.Object {
  
  // Customer defined code for the shiftActivity. Required.
  var code: js.UndefOr[NullableOption[String]] = js.native
  
  // The name of the shiftActivity. Required.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The end date and time for the shiftActivity. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Required.
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether the microsoft.graph.user should be paid for the activity during their shift. Required.
  var isPaid: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * The start date and time for the shiftActivity. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Required.
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  var theme: js.UndefOr[ScheduleEntityTheme] = js.native
}
object ShiftActivity {
  
  @scala.inline
  def apply(): ShiftActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShiftActivity]
  }
  
  @scala.inline
  implicit class ShiftActivityOps[Self <: ShiftActivity] (val x: Self) extends AnyVal {
    
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
    def setCode(value: NullableOption[String]): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setCodeNull: Self = this.set("code", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setEndDateTime(value: NullableOption[String]): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    
    @scala.inline
    def setEndDateTimeNull: Self = this.set("endDateTime", null)
    
    @scala.inline
    def setIsPaid(value: NullableOption[Boolean]): Self = this.set("isPaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPaid: Self = this.set("isPaid", js.undefined)
    
    @scala.inline
    def setIsPaidNull: Self = this.set("isPaid", null)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTimeNull: Self = this.set("startDateTime", null)
    
    @scala.inline
    def setTheme(value: ScheduleEntityTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
