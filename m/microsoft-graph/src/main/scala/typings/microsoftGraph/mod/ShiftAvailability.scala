package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShiftAvailability extends js.Object {
  
  // Specifies the pattern for recurrence
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.native
  
  // The time slot(s) preferred by the user.
  var timeSlots: js.UndefOr[NullableOption[js.Array[TimeRange]]] = js.native
  
  // Specifies the time zone for the indicated time.
  var timeZone: js.UndefOr[NullableOption[String]] = js.native
}
object ShiftAvailability {
  
  @scala.inline
  def apply(): ShiftAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShiftAvailability]
  }
  
  @scala.inline
  implicit class ShiftAvailabilityOps[Self <: ShiftAvailability] (val x: Self) extends AnyVal {
    
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
    def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrence: Self = this.set("recurrence", js.undefined)
    
    @scala.inline
    def setRecurrenceNull: Self = this.set("recurrence", null)
    
    @scala.inline
    def setTimeSlotsVarargs(value: TimeRange*): Self = this.set("timeSlots", js.Array(value :_*))
    
    @scala.inline
    def setTimeSlots(value: NullableOption[js.Array[TimeRange]]): Self = this.set("timeSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSlots: Self = this.set("timeSlots", js.undefined)
    
    @scala.inline
    def setTimeSlotsNull: Self = this.set("timeSlots", null)
    
    @scala.inline
    def setTimeZone(value: NullableOption[String]): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setTimeZoneNull: Self = this.set("timeZone", null)
  }
}
