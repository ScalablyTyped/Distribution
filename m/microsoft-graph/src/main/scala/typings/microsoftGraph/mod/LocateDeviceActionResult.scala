package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocateDeviceActionResult
  extends StObject
     with DeviceActionResult {
  
  // device location
  var deviceLocation: js.UndefOr[NullableOption[DeviceGeoLocation]] = js.undefined
}
object LocateDeviceActionResult {
  
  inline def apply(): LocateDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateDeviceActionResult]
  }
  
  extension [Self <: LocateDeviceActionResult](x: Self) {
    
    inline def setDeviceLocation(value: NullableOption[DeviceGeoLocation]): Self = StObject.set(x, "deviceLocation", value.asInstanceOf[js.Any])
    
    inline def setDeviceLocationNull: Self = StObject.set(x, "deviceLocation", null)
    
    inline def setDeviceLocationUndefined: Self = StObject.set(x, "deviceLocation", js.undefined)
  }
}
