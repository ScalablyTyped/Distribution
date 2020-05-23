package typings.paypalRestSdk.anon

import typings.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Brandname extends js.Object {
  var brand_name: js.UndefOr[String] = js.undefined
  var display_phone: js.UndefOr[Phone] = js.undefined
  var email: js.UndefOr[String] = js.undefined
}

object Brandname {
  @scala.inline
  def apply(brand_name: String = null, display_phone: Phone = null, email: String = null): Brandname = {
    val __obj = js.Dynamic.literal()
    if (brand_name != null) __obj.updateDynamic("brand_name")(brand_name.asInstanceOf[js.Any])
    if (display_phone != null) __obj.updateDynamic("display_phone")(display_phone.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brandname]
  }
}

