package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardOption extends js.Object {
  /** 需要添加的卡券列表 */
  var cardList: AddCardRequestInfo
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AddCardCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AddCardFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AddCardSuccessCallback] = js.undefined
}

object AddCardOption {
  @scala.inline
  def apply(
    cardList: AddCardRequestInfo,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* result */ AddCardSuccessCallbackResult => Unit = null
  ): AddCardOption = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AddCardOption]
  }
}

