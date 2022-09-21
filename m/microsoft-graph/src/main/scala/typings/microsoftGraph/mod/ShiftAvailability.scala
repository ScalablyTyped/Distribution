package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShiftAvailability extends StObject {
  
  // Specifies the pattern for recurrence
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.undefined
  
  // The time slot(s) preferred by the user.
  var timeSlots: js.UndefOr[NullableOption[js.Array[TimeRange]]] = js.undefined
  
  // Specifies the time zone for the indicated time.
  var timeZone: js.UndefOr[NullableOption[String]] = js.undefined
}
object ShiftAvailability {
  
  inline def apply(): ShiftAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShiftAvailability]
  }
  
  extension [Self <: ShiftAvailability](x: Self) {
    
    inline def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceNull: Self = StObject.set(x, "recurrence", null)
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    inline def setTimeSlots(value: NullableOption[js.Array[TimeRange]]): Self = StObject.set(x, "timeSlots", value.asInstanceOf[js.Any])
    
    inline def setTimeSlotsNull: Self = StObject.set(x, "timeSlots", null)
    
    inline def setTimeSlotsUndefined: Self = StObject.set(x, "timeSlots", js.undefined)
    
    inline def setTimeSlotsVarargs(value: TimeRange*): Self = StObject.set(x, "timeSlots", js.Array(value*))
    
    inline def setTimeZone(value: NullableOption[String]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
