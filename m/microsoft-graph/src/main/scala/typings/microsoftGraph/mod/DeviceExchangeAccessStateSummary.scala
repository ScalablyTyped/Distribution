package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceExchangeAccessStateSummary extends StObject {
  
  // Total count of devices with Exchange Access State: Allowed.
  var allowedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Total count of devices with Exchange Access State: Blocked.
  var blockedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Total count of devices with Exchange Access State: Quarantined.
  var quarantinedDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Total count of devices for which no Exchange Access State could be found.
  var unavailableDeviceCount: js.UndefOr[Double] = js.undefined
  
  // Total count of devices with Exchange Access State: Unknown.
  var unknownDeviceCount: js.UndefOr[Double] = js.undefined
}
object DeviceExchangeAccessStateSummary {
  
  inline def apply(): DeviceExchangeAccessStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceExchangeAccessStateSummary]
  }
  
  extension [Self <: DeviceExchangeAccessStateSummary](x: Self) {
    
    inline def setAllowedDeviceCount(value: Double): Self = StObject.set(x, "allowedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setAllowedDeviceCountUndefined: Self = StObject.set(x, "allowedDeviceCount", js.undefined)
    
    inline def setBlockedDeviceCount(value: Double): Self = StObject.set(x, "blockedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setBlockedDeviceCountUndefined: Self = StObject.set(x, "blockedDeviceCount", js.undefined)
    
    inline def setQuarantinedDeviceCount(value: Double): Self = StObject.set(x, "quarantinedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setQuarantinedDeviceCountUndefined: Self = StObject.set(x, "quarantinedDeviceCount", js.undefined)
    
    inline def setUnavailableDeviceCount(value: Double): Self = StObject.set(x, "unavailableDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setUnavailableDeviceCountUndefined: Self = StObject.set(x, "unavailableDeviceCount", js.undefined)
    
    inline def setUnknownDeviceCount(value: Double): Self = StObject.set(x, "unknownDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setUnknownDeviceCountUndefined: Self = StObject.set(x, "unknownDeviceCount", js.undefined)
  }
}
