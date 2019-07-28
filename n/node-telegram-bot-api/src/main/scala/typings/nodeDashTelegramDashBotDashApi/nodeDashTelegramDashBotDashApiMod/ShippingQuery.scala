package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingQuery extends js.Object {
  var from: User
  var id: String
  var invoice_payload: String
  var shipping_address: ShippingAddress
}

object ShippingQuery {
  @scala.inline
  def apply(from: User, id: String, invoice_payload: String, shipping_address: ShippingAddress): ShippingQuery = {
    val __obj = js.Dynamic.literal(from = from, id = id, invoice_payload = invoice_payload, shipping_address = shipping_address)
  
    __obj.asInstanceOf[ShippingQuery]
  }
}

