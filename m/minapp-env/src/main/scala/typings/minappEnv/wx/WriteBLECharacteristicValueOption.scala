package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteBLECharacteristicValueOption extends js.Object {
  /** 蓝牙特征值的 uuid */
  var characteristicId: String
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[WriteBLECharacteristicValueCompleteCallback] = js.undefined
  /** 蓝牙设备 id */
  var deviceId: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WriteBLECharacteristicValueFailCallback] = js.undefined
  /** 蓝牙特征值对应服务的 uuid */
  var serviceId: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WriteBLECharacteristicValueSuccessCallback] = js.undefined
  /** 蓝牙设备特征值对应的二进制值 */
  var value: ArrayBuffer
}

object WriteBLECharacteristicValueOption {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    value: ArrayBuffer,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): WriteBLECharacteristicValueOption = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[WriteBLECharacteristicValueOption]
  }
}

