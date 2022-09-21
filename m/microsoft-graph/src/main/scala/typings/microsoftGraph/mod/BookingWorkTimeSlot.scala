package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingWorkTimeSlot extends StObject {
  
  // The time of the day when work stops. For example, 17:00:00.0000000.
  var endTime: js.UndefOr[String] = js.undefined
  
  // The time of the day when work starts. For example, 08:00:00.0000000.
  var startTime: js.UndefOr[String] = js.undefined
}
object BookingWorkTimeSlot {
  
  inline def apply(): BookingWorkTimeSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingWorkTimeSlot]
  }
  
  extension [Self <: BookingWorkTimeSlot](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
