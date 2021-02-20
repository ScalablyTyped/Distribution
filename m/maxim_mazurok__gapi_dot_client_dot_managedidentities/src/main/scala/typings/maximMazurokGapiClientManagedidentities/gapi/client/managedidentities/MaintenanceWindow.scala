package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindow extends StObject {
  
  /** Daily cycle. */
  var dailyCycle: js.UndefOr[DailyCycle] = js.native
  
  /** Weekly cycle. */
  var weeklyCycle: js.UndefOr[WeeklyCycle] = js.native
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
    def setDailyCycle(value: DailyCycle): Self = StObject.set(x, "dailyCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyCycleUndefined: Self = StObject.set(x, "dailyCycle", js.undefined)
    
    @scala.inline
    def setWeeklyCycle(value: WeeklyCycle): Self = StObject.set(x, "weeklyCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyCycleUndefined: Self = StObject.set(x, "weeklyCycle", js.undefined)
  }
}
