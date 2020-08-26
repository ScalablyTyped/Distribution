package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnswerShippingQueryOptions extends js.Object {
  var error_message: js.UndefOr[String] = js.native
  var shipping_options: js.UndefOr[js.Array[ShippingOption]] = js.native
}

object AnswerShippingQueryOptions {
  @scala.inline
  def apply(): AnswerShippingQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerShippingQueryOptions]
  }
  @scala.inline
  implicit class AnswerShippingQueryOptionsOps[Self <: AnswerShippingQueryOptions] (val x: Self) extends AnyVal {
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
    def setError_message(value: String): Self = this.set("error_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_message: Self = this.set("error_message", js.undefined)
    @scala.inline
    def setShipping_optionsVarargs(value: ShippingOption*): Self = this.set("shipping_options", js.Array(value :_*))
    @scala.inline
    def setShipping_options(value: js.Array[ShippingOption]): Self = this.set("shipping_options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping_options: Self = this.set("shipping_options", js.undefined)
  }
  
}

