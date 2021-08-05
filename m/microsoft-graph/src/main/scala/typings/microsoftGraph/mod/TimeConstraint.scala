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
  
  inline def apply(): TimeConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeConstraint]
  }
  
  extension [Self <: TimeConstraint](x: Self) {
    
    inline def setActivityDomain(value: NullableOption[ActivityDomain]): Self = StObject.set(x, "activityDomain", value.asInstanceOf[js.Any])
    
    inline def setActivityDomainNull: Self = StObject.set(x, "activityDomain", null)
    
    inline def setActivityDomainUndefined: Self = StObject.set(x, "activityDomain", js.undefined)
    
    inline def setTimeSlots(value: NullableOption[js.Array[TimeSlot]]): Self = StObject.set(x, "timeSlots", value.asInstanceOf[js.Any])
    
    inline def setTimeSlotsNull: Self = StObject.set(x, "timeSlots", null)
    
    inline def setTimeSlotsUndefined: Self = StObject.set(x, "timeSlots", js.undefined)
    
    inline def setTimeSlotsVarargs(value: TimeSlot*): Self = StObject.set(x, "timeSlots", js.Array(value :_*))
  }
}
