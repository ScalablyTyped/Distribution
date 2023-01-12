package typings.maximMazurokGapiClientFile.gapi.client.file

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaintenanceWindow] (val x: Self) extends AnyVal {
    
    inline def setDailyCycle(value: DailyCycle): Self = StObject.set(x, "dailyCycle", value.asInstanceOf[js.Any])
    
    inline def setDailyCycleUndefined: Self = StObject.set(x, "dailyCycle", js.undefined)
    
    inline def setWeeklyCycle(value: WeeklyCycle): Self = StObject.set(x, "weeklyCycle", value.asInstanceOf[js.Any])
    
    inline def setWeeklyCycleUndefined: Self = StObject.set(x, "weeklyCycle", js.undefined)
  }
}
