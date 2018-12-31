package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

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

