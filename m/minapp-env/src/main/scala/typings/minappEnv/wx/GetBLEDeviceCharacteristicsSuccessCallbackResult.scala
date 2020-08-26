package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBLEDeviceCharacteristicsSuccessCallbackResult extends js.Object {
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
  implicit class GetBLEDeviceCharacteristicsSuccessCallbackResultOps[Self <: GetBLEDeviceCharacteristicsSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharacteristics(value: BLECharacteristic): Self = this.set("characteristics", value.asInstanceOf[js.Any])
  }
  
}

