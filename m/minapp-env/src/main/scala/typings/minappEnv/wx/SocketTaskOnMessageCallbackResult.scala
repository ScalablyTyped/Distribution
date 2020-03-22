package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTaskOnMessageCallbackResult extends js.Object {
  /** 服务器返回的消息 */
  var data: String | ArrayBuffer
}

object SocketTaskOnMessageCallbackResult {
  @scala.inline
  def apply(data: String | ArrayBuffer): SocketTaskOnMessageCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketTaskOnMessageCallbackResult]
  }
}

