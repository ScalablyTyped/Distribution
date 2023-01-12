package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingWorkHours extends StObject {
  
  /**
    * The day of the week represented by this instance. Possible values are: sunday, monday, tuesday, wednesday, thursday,
    * friday, saturday.
    */
  var day: js.UndefOr[DayOfWeek] = js.undefined
  
  // A list of start/end times during a day.
  var timeSlots: js.UndefOr[NullableOption[js.Array[BookingWorkTimeSlot]]] = js.undefined
}
object BookingWorkHours {
  
  inline def apply(): BookingWorkHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingWorkHours]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookingWorkHours] (val x: Self) extends AnyVal {
    
    inline def setDay(value: DayOfWeek): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setTimeSlots(value: NullableOption[js.Array[BookingWorkTimeSlot]]): Self = StObject.set(x, "timeSlots", value.asInstanceOf[js.Any])
    
    inline def setTimeSlotsNull: Self = StObject.set(x, "timeSlots", null)
    
    inline def setTimeSlotsUndefined: Self = StObject.set(x, "timeSlots", js.undefined)
    
    inline def setTimeSlotsVarargs(value: BookingWorkTimeSlot*): Self = StObject.set(x, "timeSlots", js.Array(value*))
  }
}
