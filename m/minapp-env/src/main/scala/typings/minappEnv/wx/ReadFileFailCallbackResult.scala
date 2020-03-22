package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory, open ${filePath}': 指定的 filePath 所在目录不存在;
    * - 'fail permission denied, open ${dirPath}': 指定的 filePath 路径没有读权限; */
  var errMsg: String
}

object ReadFileFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): ReadFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadFileFailCallbackResult]
  }
}

