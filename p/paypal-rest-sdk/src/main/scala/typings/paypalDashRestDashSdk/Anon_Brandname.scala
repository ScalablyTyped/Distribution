package typings.paypalDashRestDashSdk

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brandname extends js.Object {
  var brand_name: js.UndefOr[String] = js.undefined
  var display_phone: js.UndefOr[Phone] = js.undefined
  var email: js.UndefOr[String] = js.undefined
}

object Anon_Brandname {
  @scala.inline
  def apply(brand_name: String = null, display_phone: Phone = null, email: String = null): Anon_Brandname = {
    val __obj = js.Dynamic.literal()
    if (brand_name != null) __obj.updateDynamic("brand_name")(brand_name)
    if (display_phone != null) __obj.updateDynamic("display_phone")(display_phone)
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[Anon_Brandname]
  }
}

