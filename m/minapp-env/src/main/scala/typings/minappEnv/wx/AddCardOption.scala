package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCardOption extends js.Object {
  /** 需要添加的卡券列表 */
  var cardList: AddCardRequestInfo = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AddCardCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AddCardFailCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AddCardSuccessCallback] = js.native
}

object AddCardOption {
  @scala.inline
  def apply(cardList: AddCardRequestInfo): AddCardOption = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardOption]
  }
  @scala.inline
  implicit class AddCardOptionOps[Self <: AddCardOption] (val x: Self) extends AnyVal {
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
    def setCardList(value: AddCardRequestInfo): Self = this.set("cardList", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ AddCardSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

