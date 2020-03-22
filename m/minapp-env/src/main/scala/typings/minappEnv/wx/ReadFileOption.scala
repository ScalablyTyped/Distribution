package typings.minappEnv.wx

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

trait ReadFileOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ReadFileCompleteCallback] = js.undefined
  /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
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
  ] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ReadFileFailCallback] = js.undefined
  /** 要读取的文件的路径 */
  var filePath: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ReadFileSuccessCallback] = js.undefined
}

object ReadFileOption {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    encoding: ascii | base64 | binary | hex | `ucs2Slashucs-2Slashutf16leSlashutf-16le` | `utf-8Slashutf8` | latin1 = null,
    fail: /* result */ ReadFileFailCallbackResult => Unit = null,
    success: /* result */ ReadFileSuccessCallbackResult => Unit = null
  ): ReadFileOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ReadFileOption]
  }
}

