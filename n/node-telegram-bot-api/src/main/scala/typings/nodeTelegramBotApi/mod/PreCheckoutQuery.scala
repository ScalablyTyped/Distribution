package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreCheckoutQuery extends js.Object {
  var currency: String
  var from: User
  var id: String
  var invoice_payload: String
  var order_info: js.UndefOr[OrderInfo] = js.undefined
  var shipping_option_id: js.UndefOr[String] = js.undefined
  var total_amount: Double
}

object PreCheckoutQuery {
  @scala.inline
  def apply(
    currency: String,
    from: User,
    id: String,
    invoice_payload: String,
    total_amount: Double,
    order_info: OrderInfo = null,
    shipping_option_id: String = null
  ): PreCheckoutQuery = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_payload = invoice_payload.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
    if (order_info != null) __obj.updateDynamic("order_info")(order_info.asInstanceOf[js.Any])
    if (shipping_option_id != null) __obj.updateDynamic("shipping_option_id")(shipping_option_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreCheckoutQuery]
  }
}

