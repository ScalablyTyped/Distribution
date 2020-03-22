package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCardOption extends js.Object {
  /** 需要打开的卡券列表 */
  var cardList: OpenCardRequestInfo
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenCardCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenCardFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenCardSuccessCallback] = js.undefined
}

object OpenCardOption {
  @scala.inline
  def apply(
    cardList: OpenCardRequestInfo,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): OpenCardOption = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenCardOption]
  }
}

