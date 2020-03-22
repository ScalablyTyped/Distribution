package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteFileFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory, open ${filePath}': 指定的 filePath 所在目录不存在;
    * - 'fail permission denied, open ${dirPath}': 指定的 filePath 路径没有写权限; */
  var errMsg: String
}

object WriteFileFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): WriteFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WriteFileFailCallbackResult]
  }
}

