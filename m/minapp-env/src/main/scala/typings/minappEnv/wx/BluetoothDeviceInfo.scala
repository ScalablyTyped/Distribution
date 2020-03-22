package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 搜索到的设备列表 */
trait BluetoothDeviceInfo extends js.Object {
  /** 用于区分设备的 id */
  var deviceId: String
  /** 蓝牙设备名称，某些设备可能没有 */
  var name: String
}

object BluetoothDeviceInfo {
  @scala.inline
  def apply(deviceId: String, name: String): BluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BluetoothDeviceInfo]
  }
}

