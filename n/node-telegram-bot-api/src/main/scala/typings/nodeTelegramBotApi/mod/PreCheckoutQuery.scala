package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreCheckoutQuery extends js.Object {
  var currency: String = js.native
  var from: User = js.native
  var id: String = js.native
  var invoice_payload: String = js.native
  var order_info: js.UndefOr[OrderInfo] = js.native
  var shipping_option_id: js.UndefOr[String] = js.native
  var total_amount: Double = js.native
}

object PreCheckoutQuery {
  @scala.inline
  def apply(currency: String, from: User, id: String, invoice_payload: String, total_amount: Double): PreCheckoutQuery = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_payload = invoice_payload.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreCheckoutQuery]
  }
  @scala.inline
  implicit class PreCheckoutQueryOps[Self <: PreCheckoutQuery] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: User): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoice_payload(value: String): Self = this.set("invoice_payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_amount(value: Double): Self = this.set("total_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder_info(value: OrderInfo): Self = this.set("order_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder_info: Self = this.set("order_info", js.undefined)
    @scala.inline
    def setShipping_option_id(value: String): Self = this.set("shipping_option_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping_option_id: Self = this.set("shipping_option_id", js.undefined)
  }
  
}

