package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeeklyMaintenanceWindow extends StObject {
  
  /** Required. Allows to define schedule that runs specified day of the week. */
  var day: js.UndefOr[String] = js.undefined
  
  /** Required. Duration of the time window. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Required. Start time of the window in UTC. */
  var startTime: js.UndefOr[TimeOfDay] = js.undefined
}
object WeeklyMaintenanceWindow {
  
  inline def apply(): WeeklyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyMaintenanceWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeeklyMaintenanceWindow] (val x: Self) extends AnyVal {
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStartTime(value: TimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
