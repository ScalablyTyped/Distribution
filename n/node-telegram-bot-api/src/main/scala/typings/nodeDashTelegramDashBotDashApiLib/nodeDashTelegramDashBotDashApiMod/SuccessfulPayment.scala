package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessfulPayment extends js.Object {
  var currency: java.lang.String
  var invoice_payload: java.lang.String
  var order_info: js.UndefOr[OrderInfo] = js.undefined
  var provider_payment_charge_id: java.lang.String
  var shipping_option_id: js.UndefOr[java.lang.String] = js.undefined
  var telegram_payment_charge_id: java.lang.String
  var total_amount: scala.Double
}

object SuccessfulPayment {
  @scala.inline
  def apply(
    currency: java.lang.String,
    invoice_payload: java.lang.String,
    provider_payment_charge_id: java.lang.String,
    telegram_payment_charge_id: java.lang.String,
    total_amount: scala.Double,
    order_info: OrderInfo = null,
    shipping_option_id: java.lang.String = null
  ): SuccessfulPayment = {
    val __obj = js.Dynamic.literal(currency = currency, invoice_payload = invoice_payload, provider_payment_charge_id = provider_payment_charge_id, telegram_payment_charge_id = telegram_payment_charge_id, total_amount = total_amount)
    if (order_info != null) __obj.updateDynamic("order_info")(order_info)
    if (shipping_option_id != null) __obj.updateDynamic("shipping_option_id")(shipping_option_id)
    __obj.asInstanceOf[SuccessfulPayment]
  }
}

