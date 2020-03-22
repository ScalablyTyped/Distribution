package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WxSaveFileOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[WxSaveFileCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WxSaveFileFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WxSaveFileSuccessCallback] = js.undefined
  /** 需要保存的文件的临时路径 */
  var tempFilePath: String
}

object WxSaveFileOption {
  @scala.inline
  def apply(
    tempFilePath: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ WxSaveFileSuccessCallbackResult => Unit = null
  ): WxSaveFileOption = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[WxSaveFileOption]
  }
}

