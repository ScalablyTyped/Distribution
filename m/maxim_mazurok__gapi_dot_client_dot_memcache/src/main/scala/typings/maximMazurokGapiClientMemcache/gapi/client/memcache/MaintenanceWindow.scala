package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindow extends StObject {
  
  /** Daily cycle. */
  var dailyCycle: js.UndefOr[DailyCycle] = js.undefined
  
  /** Weekly cycle. */
  var weeklyCycle: js.UndefOr[WeeklyCycle] = js.undefined
}
object MaintenanceWindow {
  
  inline def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  extension [Self <: MaintenanceWindow](x: Self) {
    
    inline def setDailyCycle(value: DailyCycle): Self = StObject.set(x, "dailyCycle", value.asInstanceOf[js.Any])
    
    inline def setDailyCycleUndefined: Self = StObject.set(x, "dailyCycle", js.undefined)
    
    inline def setWeeklyCycle(value: WeeklyCycle): Self = StObject.set(x, "weeklyCycle", value.asInstanceOf[js.Any])
    
    inline def setWeeklyCycleUndefined: Self = StObject.set(x, "weeklyCycle", js.undefined)
  }
}
