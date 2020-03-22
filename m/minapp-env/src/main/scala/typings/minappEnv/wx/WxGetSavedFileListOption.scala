package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WxGetSavedFileListOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[WxGetSavedFileListCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WxGetSavedFileListFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WxGetSavedFileListSuccessCallback] = js.undefined
}

object WxGetSavedFileListOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ WxGetSavedFileListSuccessCallbackResult => Unit = null
  ): WxGetSavedFileListOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[WxGetSavedFileListOption]
  }
}

