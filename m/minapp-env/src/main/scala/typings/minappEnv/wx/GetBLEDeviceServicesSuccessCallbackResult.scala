package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceServicesSuccessCallbackResult extends StObject {
  
  /** 设备服务列表 */
  var services: BLEService
}
object GetBLEDeviceServicesSuccessCallbackResult {
  
  inline def apply(services: BLEService): GetBLEDeviceServicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessCallbackResult]
  }
  
  extension [Self <: GetBLEDeviceServicesSuccessCallbackResult](x: Self) {
    
    inline def setServices(value: BLEService): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
  }
}
