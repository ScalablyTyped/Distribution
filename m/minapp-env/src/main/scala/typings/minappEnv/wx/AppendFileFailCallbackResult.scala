package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppendFileFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory, open ${filePath}': 指定的 filePath 文件不存在;
    * - 'fail illegal operation on a directory, open "${filePath}" ': 指定的 filePath 是一个已经存在的目录;
    * - 'fail permission denied, open ${dirPath}': 指定的 filePath 路径没有写权限;
    * - 'fail sdcard not mounted ': 指定的 filePath 是一个已经存在的目录; */
  var errMsg: String = js.native
}

object AppendFileFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): AppendFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendFileFailCallbackResult]
  }
  @scala.inline
  implicit class AppendFileFailCallbackResultOps[Self <: AppendFileFailCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

