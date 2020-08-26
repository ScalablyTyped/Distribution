package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBLEConnectionStateChangeCallbackResult extends js.Object {
  /** 是否处于已连接状态 */
  var connected: Boolean = js.native
  /** 蓝牙设备ID */
  var deviceId: String = js.native
}

object OnBLEConnectionStateChangeCallbackResult {
  @scala.inline
  def apply(connected: Boolean, deviceId: String): OnBLEConnectionStateChangeCallbackResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBLEConnectionStateChangeCallbackResult]
  }
  @scala.inline
  implicit class OnBLEConnectionStateChangeCallbackResultOps[Self <: OnBLEConnectionStateChangeCallbackResult] (val x: Self) extends AnyVal {
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
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
  }
  
}

