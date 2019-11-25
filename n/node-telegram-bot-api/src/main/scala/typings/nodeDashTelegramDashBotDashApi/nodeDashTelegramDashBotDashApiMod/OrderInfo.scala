package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderInfo extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phone_number: js.UndefOr[String] = js.undefined
  var shipping_address: js.UndefOr[ShippingAddress] = js.undefined
}

object OrderInfo {
  @scala.inline
  def apply(
    email: String = null,
    name: String = null,
    phone_number: String = null,
    shipping_address: ShippingAddress = null
  ): OrderInfo = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number.asInstanceOf[js.Any])
    if (shipping_address != null) __obj.updateDynamic("shipping_address")(shipping_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderInfo]
  }
}

