package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import typings.minappEnv.minappEnvStrings.`ucs2Slashucs-2Slashutf16leSlashutf-16le`
import typings.minappEnv.minappEnvStrings.`utf-8Slashutf8`
import typings.minappEnv.minappEnvStrings.ascii
import typings.minappEnv.minappEnvStrings.base64
import typings.minappEnv.minappEnvStrings.binary
import typings.minappEnv.minappEnvStrings.hex
import typings.minappEnv.minappEnvStrings.latin1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteFileOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[WriteFileCompleteCallback] = js.native
  /** 要写入的文本或二进制数据 */
  var data: String | ArrayBuffer = js.native
  /** 指定写入文件的字符编码
    *
    * 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2/ucs-2/utf16le/utf-16le': 以小端序读取;
    * - 'utf-8/utf8': ;
    * - 'latin1': ; */
  var encoding: js.UndefOr[
    ascii | base64 | binary | hex | `ucs2Slashucs-2Slashutf16leSlashutf-16le` | `utf-8Slashutf8` | latin1
  ] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WriteFileFailCallback] = js.native
  /** 要写入的文件路径 */
  var filePath: String = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WriteFileSuccessCallback] = js.native
}

object WriteFileOption {
  @scala.inline
  def apply(data: String | ArrayBuffer, filePath: String): WriteFileOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileOption]
  }
  @scala.inline
  implicit class WriteFileOptionOps[Self <: WriteFileOption] (val x: Self) extends AnyVal {
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
    def setData(value: String | ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setEncoding(
      value: ascii | base64 | binary | hex | `ucs2Slashucs-2Slashutf16leSlashutf-16le` | `utf-8Slashutf8` | latin1
    ): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFail(value: /* result */ WriteFileFailCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

