package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveSavedFileFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail file not exist': 指定的 tempFilePath 找不到文件; */
  var errMsg: String
}

object RemoveSavedFileFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): RemoveSavedFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveSavedFileFailCallbackResult]
  }
}

