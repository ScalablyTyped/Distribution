package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBLECharacteristicValueChangeCallbackResult extends js.Object {
  /** 蓝牙特征值的 uuid */
  var characteristicId: String
  /** 蓝牙设备 id */
  var deviceId: String
  /** 蓝牙特征值对应服务的 uuid */
  var serviceId: String
  /** 特征值最新的值 */
  var value: ArrayBuffer
}

object OnBLECharacteristicValueChangeCallbackResult {
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String, value: ArrayBuffer): OnBLECharacteristicValueChangeCallbackResult = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnBLECharacteristicValueChangeCallbackResult]
  }
}

