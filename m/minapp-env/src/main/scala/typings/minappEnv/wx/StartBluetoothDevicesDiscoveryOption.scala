package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBluetoothDevicesDiscoveryOption extends js.Object {
  /** 是否允许重复上报同一设备。如果允许重复上报，则 `wx.onBlueToothDeviceFound` 方法会多次上报同一设备，但是 RSSI 值会有不同。 */
  var allowDuplicatesKey: js.UndefOr[Boolean] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartBluetoothDevicesDiscoveryCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartBluetoothDevicesDiscoveryFailCallback] = js.native
  /** 上报设备的间隔。0 表示找到新设备立即上报，其他数值根据传入的间隔上报。 */
  var interval: js.UndefOr[Double] = js.native
  /** 要搜索但蓝牙设备主 service 的 uuid 列表。某些蓝牙设备会广播自己的主 service 的 uuid。如果设置此参数，则只搜索广播包有对应 uuid 的主服务的蓝牙设备。建议主要通过该参数过滤掉周边不需要处理的其他蓝牙设备。 */
  var services: js.UndefOr[Array[String]] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartBluetoothDevicesDiscoverySuccessCallback] = js.native
}

object StartBluetoothDevicesDiscoveryOption {
  @scala.inline
  def apply(): StartBluetoothDevicesDiscoveryOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBluetoothDevicesDiscoveryOption]
  }
  @scala.inline
  implicit class StartBluetoothDevicesDiscoveryOptionOps[Self <: StartBluetoothDevicesDiscoveryOption] (val x: Self) extends AnyVal {
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
    def setAllowDuplicatesKey(value: Boolean): Self = this.set("allowDuplicatesKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDuplicatesKey: Self = this.set("allowDuplicatesKey", js.undefined)
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setServices(value: Array[String]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

