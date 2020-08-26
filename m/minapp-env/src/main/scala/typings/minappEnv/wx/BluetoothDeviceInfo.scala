package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 搜索到的设备列表 */
@js.native
trait BluetoothDeviceInfo extends js.Object {
  /** 用于区分设备的 id */
  var deviceId: String = js.native
  /** 蓝牙设备名称，某些设备可能没有 */
  var name: String = js.native
}

object BluetoothDeviceInfo {
  @scala.inline
  def apply(deviceId: String, name: String): BluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDeviceInfo]
  }
  @scala.inline
  implicit class BluetoothDeviceInfoOps[Self <: BluetoothDeviceInfo] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

