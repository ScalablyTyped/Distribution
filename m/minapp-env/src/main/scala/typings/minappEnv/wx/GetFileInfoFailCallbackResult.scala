package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail file not exist': 指定的 filePath 找不到文件; */
  var errMsg: String
}

object GetFileInfoFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): GetFileInfoFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoFailCallbackResult]
  }
}

