package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnStopCallbackResult extends js.Object {
  /** 录音文件的临时路径 */
  var tempFilePath: String
}

object OnStopCallbackResult {
  @scala.inline
  def apply(tempFilePath: String): OnStopCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStopCallbackResult]
  }
}

