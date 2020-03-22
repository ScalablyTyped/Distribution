package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import typings.minappEnv.minappEnvNumbers.`1`
import typings.minappEnv.minappEnvNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHCEMessageCallbackResult extends js.Object {
  /** `messageType=1` 时 ,客户端接收到 NFC 设备的指令 */
  var data: ArrayBuffer
  /** 消息类型
    *
    * 可选值：
    * - 1: HCE APDU Command类型，小程序需对此指令进行处理，并调用 sendHCEMessage 接口返回处理指令;
    * - 2: 设备离场事件类型; */
  var messageType: `1` | `2`
  /** `messageType=2` 时，原因 */
  var reason: Double
}

object OnHCEMessageCallbackResult {
  @scala.inline
  def apply(data: ArrayBuffer, messageType: `1` | `2`, reason: Double): OnHCEMessageCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnHCEMessageCallbackResult]
  }
}

