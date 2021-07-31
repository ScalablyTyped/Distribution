package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeConstraint extends StObject {
  
  // The nature of the activity, optional. The possible values are: work, personal, unrestricted, or unknown.
  var activityDomain: js.UndefOr[NullableOption[ActivityDomain]] = js.undefined
  
  var timeSlots: js.UndefOr[NullableOption[js.Array[TimeSlot]]] = js.undefined
}
object TimeConstraint {
  
  @scala.inline
  def apply(): TimeConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeConstraint]
  }
  
  @scala.inline
  implicit class TimeConstraintMutableBuilder[Self <: TimeConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityDomain(value: NullableOption[ActivityDomain]): Self = StObject.set(x, "activityDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityDomainNull: Self = StObject.set(x, "activityDomain", null)
    
    @scala.inline
    def setActivityDomainUndefined: Self = StObject.set(x, "activityDomain", js.undefined)
    
    @scala.inline
    def setTimeSlots(value: NullableOption[js.Array[TimeSlot]]): Self = StObject.set(x, "timeSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSlotsNull: Self = StObject.set(x, "timeSlots", null)
    
    @scala.inline
    def setTimeSlotsUndefined: Self = StObject.set(x, "timeSlots", js.undefined)
    
    @scala.inline
    def setTimeSlotsVarargs(value: TimeSlot*): Self = StObject.set(x, "timeSlots", js.Array(value :_*))
  }
}
