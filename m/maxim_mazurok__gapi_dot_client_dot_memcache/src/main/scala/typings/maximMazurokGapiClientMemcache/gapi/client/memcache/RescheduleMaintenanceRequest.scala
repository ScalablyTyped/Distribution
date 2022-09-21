package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RescheduleMaintenanceRequest extends StObject {
  
  /** Required. If reschedule type is SPECIFIC_TIME, must set up schedule_time as well. */
  var rescheduleType: js.UndefOr[String] = js.undefined
  
  /** Timestamp when the maintenance shall be rescheduled to if reschedule_type=SPECIFIC_TIME, in RFC 3339 format, for example `2012-11-15T16:19:00.094Z`. */
  var scheduleTime: js.UndefOr[String] = js.undefined
}
object RescheduleMaintenanceRequest {
  
  inline def apply(): RescheduleMaintenanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RescheduleMaintenanceRequest]
  }
  
  extension [Self <: RescheduleMaintenanceRequest](x: Self) {
    
    inline def setRescheduleType(value: String): Self = StObject.set(x, "rescheduleType", value.asInstanceOf[js.Any])
    
    inline def setRescheduleTypeUndefined: Self = StObject.set(x, "rescheduleType", js.undefined)
    
    inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
  }
}
