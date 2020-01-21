package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Address
import typings.paypalRestSdk.mod.Phone
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
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (business_name != null) __obj.updateDynamic("business_name")(business_name.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
}

