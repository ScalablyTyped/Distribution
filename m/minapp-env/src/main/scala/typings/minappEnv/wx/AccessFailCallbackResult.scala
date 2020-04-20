package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory ${path}': 文件/目录不存在; */
  var errMsg: String
}

object AccessFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): AccessFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessFailCallbackResult]
  }
}

