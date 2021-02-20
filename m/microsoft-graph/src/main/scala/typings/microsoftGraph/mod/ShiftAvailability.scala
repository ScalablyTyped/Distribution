package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShiftAvailability extends StObject {
  
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
  implicit class ShiftAvailabilityMutableBuilder[Self <: ShiftAvailability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceNull: Self = StObject.set(x, "recurrence", null)
    
    @scala.inline
    def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    @scala.inline
    def setTimeSlots(value: NullableOption[js.Array[TimeRange]]): Self = StObject.set(x, "timeSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSlotsNull: Self = StObject.set(x, "timeSlots", null)
    
    @scala.inline
    def setTimeSlotsUndefined: Self = StObject.set(x, "timeSlots", js.undefined)
    
    @scala.inline
    def setTimeSlotsVarargs(value: TimeRange*): Self = StObject.set(x, "timeSlots", js.Array(value :_*))
    
    @scala.inline
    def setTimeZone(value: NullableOption[String]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
