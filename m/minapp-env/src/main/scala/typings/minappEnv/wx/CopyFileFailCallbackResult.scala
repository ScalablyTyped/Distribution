package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyFileFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail permission denied, copyFile ${srcPath} -> ${destPath}': 指定目标文件路径没有写权限;
    * - 'fail no such file or directory, copyFile ${srcPath} -> ${destPath}': 源文件不存在，或目标文件路径的上层目录不存在; */
  var errMsg: String = js.native
}

object CopyFileFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): CopyFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFileFailCallbackResult]
  }
  @scala.inline
  implicit class CopyFileFailCallbackResultOps[Self <: CopyFileFailCallbackResult] (val x: Self) extends AnyVal {
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

