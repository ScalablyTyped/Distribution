package typings
package paypalDashRestDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brandname extends js.Object {
  var brand_name: js.UndefOr[java.lang.String] = js.undefined
  var display_phone: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Phone] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Brandname {
  @scala.inline
  def apply(
    brand_name: java.lang.String = null,
    display_phone: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Phone = null,
    email: java.lang.String = null
  ): Anon_Brandname = {
    val __obj = js.Dynamic.literal()
    if (brand_name != null) __obj.updateDynamic("brand_name")(brand_name)
    if (display_phone != null) __obj.updateDynamic("display_phone")(display_phone)
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[Anon_Brandname]
  }
}

