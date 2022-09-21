package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindow extends StObject {
  
  /** day of week (1-7), starting on Monday. */
  var day: js.UndefOr[Double] = js.undefined
  
  /** hour of day - 0 to 23. */
  var hour: js.UndefOr[Double] = js.undefined
  
  /** This is always `sql#maintenanceWindow`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Maintenance timing setting: `canary` (Earlier) or `stable` (Later). [Learn more](https://cloud.google.com/sql/docs/mysql/instance-settings#maintenance-timing-2ndgen). */
  var updateTrack: js.UndefOr[String] = js.undefined
}
object MaintenanceWindow {
  
  inline def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  extension [Self <: MaintenanceWindow](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUpdateTrack(value: String): Self = StObject.set(x, "updateTrack", value.asInstanceOf[js.Any])
    
    inline def setUpdateTrackUndefined: Self = StObject.set(x, "updateTrack", js.undefined)
  }
}
