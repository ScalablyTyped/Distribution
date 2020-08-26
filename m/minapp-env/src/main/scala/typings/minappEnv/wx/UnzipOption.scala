package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnzipOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UnzipCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UnzipFailCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UnzipSuccessCallback] = js.native
  /** 目标目录路径 */
  var targetPath: String = js.native
  /** 源文件路径，只可以是 zip 压缩文件 */
  var zipFilePath: String = js.native
}

object UnzipOption {
  @scala.inline
  def apply(targetPath: String, zipFilePath: String): UnzipOption = {
    val __obj = js.Dynamic.literal(targetPath = targetPath.asInstanceOf[js.Any], zipFilePath = zipFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnzipOption]
  }
  @scala.inline
  implicit class UnzipOptionOps[Self <: UnzipOption] (val x: Self) extends AnyVal {
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
    def setTargetPath(value: String): Self = this.set("targetPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setZipFilePath(value: String): Self = this.set("zipFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* result */ UnzipFailCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

