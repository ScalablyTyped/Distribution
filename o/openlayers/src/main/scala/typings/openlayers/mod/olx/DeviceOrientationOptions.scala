package typings.openlayers.mod.olx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceOrientationOptions extends StObject {
  
  var tracking: js.UndefOr[Boolean] = js.native
}
object DeviceOrientationOptions {
  
  @scala.inline
  def apply(): DeviceOrientationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOrientationOptions]
  }
  
  @scala.inline
  implicit class DeviceOrientationOptionsMutableBuilder[Self <: DeviceOrientationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTracking(value: Boolean): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
  }
}
