package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderInfo extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var phone_number: js.UndefOr[java.lang.String] = js.undefined
  var shipping_address: js.UndefOr[ShippingAddress] = js.undefined
}

object OrderInfo {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    name: java.lang.String = null,
    phone_number: java.lang.String = null,
    shipping_address: ShippingAddress = null
  ): OrderInfo = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number)
    if (shipping_address != null) __obj.updateDynamic("shipping_address")(shipping_address)
    __obj.asInstanceOf[OrderInfo]
  }
}

