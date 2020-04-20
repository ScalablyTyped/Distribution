package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartRecordSuccessCallbackResult extends js.Object {
  /** 录音文件的临时路径 */
  var tempFilePath: String
}

object StartRecordSuccessCallbackResult {
  @scala.inline
  def apply(tempFilePath: String): StartRecordSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecordSuccessCallbackResult]
  }
}

