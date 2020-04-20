package typings.nodeTelegramBotApi.mod

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
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_payload = invoice_payload.asInstanceOf[js.Any], shipping_address = shipping_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingQuery]
  }
}

