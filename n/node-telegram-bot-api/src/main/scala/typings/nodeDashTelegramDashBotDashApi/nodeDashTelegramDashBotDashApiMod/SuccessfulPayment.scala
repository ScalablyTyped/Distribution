package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessfulPayment extends js.Object {
  var currency: String
  var invoice_payload: String
  var order_info: js.UndefOr[OrderInfo] = js.undefined
  var provider_payment_charge_id: String
  var shipping_option_id: js.UndefOr[String] = js.undefined
  var telegram_payment_charge_id: String
  var total_amount: Double
}

object SuccessfulPayment {
  @scala.inline
  def apply(
    currency: String,
    invoice_payload: String,
    provider_payment_charge_id: String,
    telegram_payment_charge_id: String,
    total_amount: Double,
    order_info: OrderInfo = null,
    shipping_option_id: String = null
  ): SuccessfulPayment = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], invoice_payload = invoice_payload.asInstanceOf[js.Any], provider_payment_charge_id = provider_payment_charge_id.asInstanceOf[js.Any], telegram_payment_charge_id = telegram_payment_charge_id.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
    if (order_info != null) __obj.updateDynamic("order_info")(order_info.asInstanceOf[js.Any])
    if (shipping_option_id != null) __obj.updateDynamic("shipping_option_id")(shipping_option_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessfulPayment]
  }
}

