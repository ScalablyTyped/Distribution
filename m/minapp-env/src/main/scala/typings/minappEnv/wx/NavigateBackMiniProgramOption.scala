package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackMiniProgramOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NavigateBackMiniProgramCompleteCallback] = js.undefined
  /** 需要返回给上一个小程序的数据，上一个小程序可在 `App.onShow` 中获取到这份数据。 [详情]((小程序 App))。 */
  var extraData: js.UndefOr[js.Object] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NavigateBackMiniProgramFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[NavigateBackMiniProgramSuccessCallback] = js.undefined
}

object NavigateBackMiniProgramOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    extraData: js.Object = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): NavigateBackMiniProgramOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigateBackMiniProgramOption]
  }
}

