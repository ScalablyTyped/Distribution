package typings.openlayers.mod.olx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceOrientationOptions extends StObject {
  
  var tracking: js.UndefOr[Boolean] = js.undefined
}
object DeviceOrientationOptions {
  
  inline def apply(): DeviceOrientationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOrientationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceOrientationOptions] (val x: Self) extends AnyVal {
    
    inline def setTracking(value: Boolean): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
    
    inline def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
  }
}
