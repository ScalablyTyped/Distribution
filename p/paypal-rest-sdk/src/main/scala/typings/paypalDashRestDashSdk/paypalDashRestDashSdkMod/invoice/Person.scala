package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Address
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  var address: js.UndefOr[Address] = js.undefined
  var business_name: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var first_name: js.UndefOr[String] = js.undefined
  var last_name: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[Phone] = js.undefined
  var website: js.UndefOr[String] = js.undefined
}

object Person {
  @scala.inline
  def apply(
    address: Address = null,
    business_name: String = null,
    email: String = null,
    first_name: String = null,
    last_name: String = null,
    phone: Phone = null,
    website: String = null
  ): Person = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (business_name != null) __obj.updateDynamic("business_name")(business_name)
    if (email != null) __obj.updateDynamic("email")(email)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[Person]
  }
}

