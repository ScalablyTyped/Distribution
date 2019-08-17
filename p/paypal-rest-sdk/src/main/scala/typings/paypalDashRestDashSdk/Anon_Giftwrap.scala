package typings.paypalDashRestDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Giftwrap extends js.Object {
  var gift_wrap: js.UndefOr[String] = js.undefined
  var handling_fee: js.UndefOr[String] = js.undefined
  var insurance: js.UndefOr[String] = js.undefined
  var shipping: js.UndefOr[String] = js.undefined
  var shipping_discout: js.UndefOr[String] = js.undefined
  var subtotal: js.UndefOr[String] = js.undefined
  var tax: js.UndefOr[String] = js.undefined
}

object Anon_Giftwrap {
  @scala.inline
  def apply(
    gift_wrap: String = null,
    handling_fee: String = null,
    insurance: String = null,
    shipping: String = null,
    shipping_discout: String = null,
    subtotal: String = null,
    tax: String = null
  ): Anon_Giftwrap = {
    val __obj = js.Dynamic.literal()
    if (gift_wrap != null) __obj.updateDynamic("gift_wrap")(gift_wrap)
    if (handling_fee != null) __obj.updateDynamic("handling_fee")(handling_fee)
    if (insurance != null) __obj.updateDynamic("insurance")(insurance)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (shipping_discout != null) __obj.updateDynamic("shipping_discout")(shipping_discout)
    if (subtotal != null) __obj.updateDynamic("subtotal")(subtotal)
    if (tax != null) __obj.updateDynamic("tax")(tax)
    __obj.asInstanceOf[Anon_Giftwrap]
  }
}

