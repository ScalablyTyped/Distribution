package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBLEConnectionStateChangeCallbackResult extends js.Object {
  /** 是否处于已连接状态 */
  var connected: Boolean
  /** 蓝牙设备ID */
  var deviceId: String
}

object OnBLEConnectionStateChangeCallbackResult {
  @scala.inline
  def apply(connected: Boolean, deviceId: String): OnBLEConnectionStateChangeCallbackResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnBLEConnectionStateChangeCallbackResult]
  }
}

