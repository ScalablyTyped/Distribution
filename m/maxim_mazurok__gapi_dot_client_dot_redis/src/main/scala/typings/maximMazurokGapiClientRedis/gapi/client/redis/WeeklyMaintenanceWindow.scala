package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeeklyMaintenanceWindow extends StObject {
  
  /** Required. The day of week that maintenance updates occur. */
  var day: js.UndefOr[String] = js.undefined
  
  /** Output only. Duration of the maintenance window. The current window is fixed at 1 hour. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Required. Start time of the window in UTC time. */
  var startTime: js.UndefOr[TimeOfDay] = js.undefined
}
object WeeklyMaintenanceWindow {
  
  inline def apply(): WeeklyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyMaintenanceWindow]
  }
  
  extension [Self <: WeeklyMaintenanceWindow](x: Self) {
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStartTime(value: TimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
