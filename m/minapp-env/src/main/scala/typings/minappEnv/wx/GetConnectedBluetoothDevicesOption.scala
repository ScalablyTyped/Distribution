package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetConnectedBluetoothDevicesCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetConnectedBluetoothDevicesFailCallback] = js.undefined
  /** 蓝牙设备主 service 的 uuid 列表 */
  var services: Array[String]
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetConnectedBluetoothDevicesSuccessCallback] = js.undefined
}

object GetConnectedBluetoothDevicesOption {
  @scala.inline
  def apply(
    services: Array[String],
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ GetConnectedBluetoothDevicesSuccessCallbackResult => Unit = null
  ): GetConnectedBluetoothDevicesOption = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOption]
  }
}

