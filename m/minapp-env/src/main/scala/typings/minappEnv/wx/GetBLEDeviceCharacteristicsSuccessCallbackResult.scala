package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceCharacteristicsSuccessCallbackResult extends js.Object {
  /** 设备服务列表 */
  var characteristics: BLECharacteristic
}

object GetBLEDeviceCharacteristicsSuccessCallbackResult {
  @scala.inline
  def apply(characteristics: BLECharacteristic): GetBLEDeviceCharacteristicsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccessCallbackResult]
  }
}

