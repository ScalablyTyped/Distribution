package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceCharacteristicsSuccessCallbackResult extends StObject {
  
  /** 设备服务列表 */
  var characteristics: BLECharacteristic = js.native
}
object GetBLEDeviceCharacteristicsSuccessCallbackResult {
  
  @scala.inline
  def apply(characteristics: BLECharacteristic): GetBLEDeviceCharacteristicsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBLEDeviceCharacteristicsSuccessCallbackResultMutableBuilder[Self <: GetBLEDeviceCharacteristicsSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristics(value: BLECharacteristic): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
  }
}
