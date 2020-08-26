package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyBLECharacteristicValueChangeOption extends js.Object {
  /** 蓝牙特征值的 uuid */
  var characteristicId: String = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NotifyBLECharacteristicValueChangeCompleteCallback] = js.native
  /** 蓝牙设备 id */
  var deviceId: String = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NotifyBLECharacteristicValueChangeFailCallback] = js.native
  /** 蓝牙特征值对应服务的 uuid */
  var serviceId: String = js.native
  /** 是否启用 notify */
  var state: Boolean = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[NotifyBLECharacteristicValueChangeSuccessCallback] = js.native
}

object NotifyBLECharacteristicValueChangeOption {
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String, state: Boolean): NotifyBLECharacteristicValueChangeOption = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangeOption]
  }
  @scala.inline
  implicit class NotifyBLECharacteristicValueChangeOptionOps[Self <: NotifyBLECharacteristicValueChangeOption] (val x: Self) extends AnyVal {
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
    def setCharacteristicId(value: String): Self = this.set("characteristicId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: Boolean): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

