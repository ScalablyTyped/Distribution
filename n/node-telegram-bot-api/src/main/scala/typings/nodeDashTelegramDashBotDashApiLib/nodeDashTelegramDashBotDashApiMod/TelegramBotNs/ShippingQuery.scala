package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingQuery extends js.Object {
  var from: User
  var id: java.lang.String
  var invoice_payload: java.lang.String
  var shipping_address: ShippingAddress
}

object ShippingQuery {
  @scala.inline
  def apply(
    from: User,
    id: java.lang.String,
    invoice_payload: java.lang.String,
    shipping_address: ShippingAddress
  ): ShippingQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("invoice_payload")(invoice_payload)
    __obj.updateDynamic("shipping_address")(shipping_address)
    __obj.asInstanceOf[ShippingQuery]
  }
}

