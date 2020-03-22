package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnzipFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail permission denied, unzip ${zipFilePath} -> ${destPath}': 指定目标文件路径没有写权限;
    * - 'fail no such file or directory, unzip ${zipFilePath} -> "${destPath}': 源文件不存在，或目标文件路径的上层目录不存在; */
  var errMsg: String
}

object UnzipFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): UnzipFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnzipFailCallbackResult]
  }
}

