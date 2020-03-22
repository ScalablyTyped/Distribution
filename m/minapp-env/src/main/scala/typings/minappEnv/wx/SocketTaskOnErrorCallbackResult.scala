package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTaskOnErrorCallbackResult extends js.Object {
  /** 错误信息 */
  var errMsg: String
}

object SocketTaskOnErrorCallbackResult {
  @scala.inline
  def apply(errMsg: String): SocketTaskOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketTaskOnErrorCallbackResult]
  }
}

