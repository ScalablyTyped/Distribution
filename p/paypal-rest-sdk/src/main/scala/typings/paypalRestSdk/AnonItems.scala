package typings.paypalRestSdk

import typings.paypalRestSdk.mod.Address
import typings.paypalRestSdk.mod.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var items: js.Array[Item]
  var shipping_address: js.UndefOr[Address] = js.undefined
  var shipping_method: js.UndefOr[String] = js.undefined
  var shipping_phone_number: js.UndefOr[String] = js.undefined
}

object AnonItems {
  @scala.inline
  def apply(
    items: js.Array[Item],
    shipping_address: Address = null,
    shipping_method: String = null,
    shipping_phone_number: String = null
  ): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (shipping_address != null) __obj.updateDynamic("shipping_address")(shipping_address.asInstanceOf[js.Any])
    if (shipping_method != null) __obj.updateDynamic("shipping_method")(shipping_method.asInstanceOf[js.Any])
    if (shipping_phone_number != null) __obj.updateDynamic("shipping_phone_number")(shipping_phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
}

