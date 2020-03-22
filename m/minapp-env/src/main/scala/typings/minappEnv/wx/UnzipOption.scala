package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnzipOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UnzipCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UnzipFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UnzipSuccessCallback] = js.undefined
  /** 目标目录路径 */
  var targetPath: String
  /** 源文件路径，只可以是 zip 压缩文件 */
  var zipFilePath: String
}

object UnzipOption {
  @scala.inline
  def apply(
    targetPath: String,
    zipFilePath: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* result */ UnzipFailCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): UnzipOption = {
    val __obj = js.Dynamic.literal(targetPath = targetPath.asInstanceOf[js.Any], zipFilePath = zipFilePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[UnzipOption]
  }
}

