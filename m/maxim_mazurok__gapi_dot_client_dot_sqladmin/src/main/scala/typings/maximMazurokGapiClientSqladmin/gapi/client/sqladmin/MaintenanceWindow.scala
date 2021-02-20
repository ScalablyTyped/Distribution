package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindow extends StObject {
  
  /** day of week (1-7), starting on Monday. */
  var day: js.UndefOr[Double] = js.native
  
  /** hour of day - 0 to 23. */
  var hour: js.UndefOr[Double] = js.native
  
  /** This is always *sql#maintenanceWindow*. */
  var kind: js.UndefOr[String] = js.native
  
  /** Maintenance timing setting: *canary* (Earlier) or *stable* (Later). Learn more. */
  var updateTrack: js.UndefOr[String] = js.native
}
object MaintenanceWindow {
  
  @scala.inline
  def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  @scala.inline
  implicit class MaintenanceWindowMutableBuilder[Self <: MaintenanceWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUpdateTrack(value: String): Self = StObject.set(x, "updateTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTrackUndefined: Self = StObject.set(x, "updateTrack", js.undefined)
  }
}
