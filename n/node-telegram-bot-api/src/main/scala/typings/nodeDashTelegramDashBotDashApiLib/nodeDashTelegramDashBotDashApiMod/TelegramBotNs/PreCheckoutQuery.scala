package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreCheckoutQuery extends js.Object {
  var currency: java.lang.String
  var from: User
  var id: java.lang.String
  var invoice_payload: java.lang.String
  var order_info: js.UndefOr[OrderInfo] = js.undefined
  var shipping_option_id: js.UndefOr[java.lang.String] = js.undefined
  var total_amount: scala.Double
}

object PreCheckoutQuery {
  @scala.inline
  def apply(
    currency: java.lang.String,
    from: User,
    id: java.lang.String,
    invoice_payload: java.lang.String,
    total_amount: scala.Double,
    order_info: OrderInfo = null,
    shipping_option_id: java.lang.String = null
  ): PreCheckoutQuery = {
    val __obj = js.Dynamic.literal(currency = currency, from = from, id = id, invoice_payload = invoice_payload, total_amount = total_amount)
    if (order_info != null) __obj.updateDynamic("order_info")(order_info)
    if (shipping_option_id != null) __obj.updateDynamic("shipping_option_id")(shipping_option_id)
    __obj.asInstanceOf[PreCheckoutQuery]
  }
}

