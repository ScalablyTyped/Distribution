package typings
package paypalDashRestDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  var items: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Item]
  var shipping_address: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Address] = js.undefined
  var shipping_method: js.UndefOr[java.lang.String] = js.undefined
  var shipping_phone_number: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Items {
  @scala.inline
  def apply(
    items: js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Item],
    shipping_address: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Address = null,
    shipping_method: java.lang.String = null,
    shipping_phone_number: java.lang.String = null
  ): Anon_Items = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    if (shipping_address != null) __obj.updateDynamic("shipping_address")(shipping_address)
    if (shipping_method != null) __obj.updateDynamic("shipping_method")(shipping_method)
    if (shipping_phone_number != null) __obj.updateDynamic("shipping_phone_number")(shipping_phone_number)
    __obj.asInstanceOf[Anon_Items]
  }
}

