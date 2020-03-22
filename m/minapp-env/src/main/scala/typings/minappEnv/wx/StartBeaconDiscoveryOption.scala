package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBeaconDiscoveryOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartBeaconDiscoveryCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartBeaconDiscoveryFailCallback] = js.undefined
  /** 是否校验蓝牙开关，仅在 iOS 下有效 */
  var ignoreBluetoothAvailable: js.UndefOr[Boolean] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartBeaconDiscoverySuccessCallback] = js.undefined
  /** iBeacon 设备广播的 uuid 列表 */
  var uuids: Array[String]
}

object StartBeaconDiscoveryOption {
  @scala.inline
  def apply(
    uuids: Array[String],
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    ignoreBluetoothAvailable: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): StartBeaconDiscoveryOption = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(ignoreBluetoothAvailable)) __obj.updateDynamic("ignoreBluetoothAvailable")(ignoreBluetoothAvailable.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StartBeaconDiscoveryOption]
  }
}

