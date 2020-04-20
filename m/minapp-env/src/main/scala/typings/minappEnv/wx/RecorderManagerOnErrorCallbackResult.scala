package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderManagerOnErrorCallbackResult extends js.Object {
  /** 错误信息 */
  var errMsg: String
}

object RecorderManagerOnErrorCallbackResult {
  @scala.inline
  def apply(errMsg: String): RecorderManagerOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderManagerOnErrorCallbackResult]
  }
}

