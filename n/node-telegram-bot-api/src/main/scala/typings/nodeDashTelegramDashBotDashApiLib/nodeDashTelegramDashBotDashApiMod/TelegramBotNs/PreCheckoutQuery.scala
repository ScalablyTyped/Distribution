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

