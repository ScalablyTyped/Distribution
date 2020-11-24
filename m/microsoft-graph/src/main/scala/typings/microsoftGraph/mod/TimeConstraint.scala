package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeConstraint extends js.Object {
  
  // The nature of the activity, optional. The possible values are: work, personal, unrestricted, or unknown.
  var activityDomain: js.UndefOr[NullableOption[ActivityDomain]] = js.native
  
  var timeSlots: js.UndefOr[NullableOption[js.Array[TimeSlot]]] = js.native
}
object TimeConstraint {
  
  @scala.inline
  def apply(): TimeConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeConstraint]
  }
  
  @scala.inline
  implicit class TimeConstraintOps[Self <: TimeConstraint] (val x: Self) extends AnyVal {
    
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
    def setActivityDomain(value: NullableOption[ActivityDomain]): Self = this.set("activityDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityDomain: Self = this.set("activityDomain", js.undefined)
    
    @scala.inline
    def setActivityDomainNull: Self = this.set("activityDomain", null)
    
    @scala.inline
    def setTimeSlotsVarargs(value: TimeSlot*): Self = this.set("timeSlots", js.Array(value :_*))
    
    @scala.inline
    def setTimeSlots(value: NullableOption[js.Array[TimeSlot]]): Self = this.set("timeSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSlots: Self = this.set("timeSlots", js.undefined)
    
    @scala.inline
    def setTimeSlotsNull: Self = this.set("timeSlots", null)
  }
}
