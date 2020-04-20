package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail permission denied, rename ${oldPath} -> ${newPath}': 指定源文件或目标文件没有写权限;
    * - 'fail no such file or directory, rename ${oldPath} -> ${newPath}': 源文件不存在，或目标文件路径的上层目录不存在; */
  var errMsg: String
}

object RenameFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): RenameFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameFailCallbackResult]
  }
}

