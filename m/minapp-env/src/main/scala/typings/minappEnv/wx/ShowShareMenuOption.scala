package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowShareMenuOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowShareMenuCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowShareMenuFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowShareMenuSuccessCallback] = js.undefined
  /** 是否使用带 shareTicket 的转发[详情]((转发#获取更多转发信息)) */
  var withShareTicket: js.UndefOr[Boolean] = js.undefined
}

object ShowShareMenuOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null,
    withShareTicket: js.UndefOr[Boolean] = js.undefined
  ): ShowShareMenuOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(withShareTicket)) __obj.updateDynamic("withShareTicket")(withShareTicket.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowShareMenuOption]
  }
}

