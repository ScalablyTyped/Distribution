package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBluetoothDevicesDiscoveryOption extends js.Object {
  /** 是否允许重复上报同一设备。如果允许重复上报，则 `wx.onBlueToothDeviceFound` 方法会多次上报同一设备，但是 RSSI 值会有不同。 */
  var allowDuplicatesKey: js.UndefOr[Boolean] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartBluetoothDevicesDiscoveryCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartBluetoothDevicesDiscoveryFailCallback] = js.undefined
  /** 上报设备的间隔。0 表示找到新设备立即上报，其他数值根据传入的间隔上报。 */
  var interval: js.UndefOr[Double] = js.undefined
  /** 要搜索但蓝牙设备主 service 的 uuid 列表。某些蓝牙设备会广播自己的主 service 的 uuid。如果设置此参数，则只搜索广播包有对应 uuid 的主服务的蓝牙设备。建议主要通过该参数过滤掉周边不需要处理的其他蓝牙设备。 */
  var services: js.UndefOr[Array[String]] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartBluetoothDevicesDiscoverySuccessCallback] = js.undefined
}

object StartBluetoothDevicesDiscoveryOption {
  @scala.inline
  def apply(
    allowDuplicatesKey: js.UndefOr[Boolean] = js.undefined,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    interval: Int | Double = null,
    services: Array[String] = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): StartBluetoothDevicesDiscoveryOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicatesKey)) __obj.updateDynamic("allowDuplicatesKey")(allowDuplicatesKey.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StartBluetoothDevicesDiscoveryOption]
  }
}

