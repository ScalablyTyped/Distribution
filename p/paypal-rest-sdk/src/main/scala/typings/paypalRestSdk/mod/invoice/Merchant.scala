package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Address
import typings.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Merchant extends Person {
  var additional_info: js.UndefOr[String] = js.undefined
  var additional_info_label: js.UndefOr[String] = js.undefined
  var fax: js.UndefOr[Phone] = js.undefined
  var tax_id: js.UndefOr[String] = js.undefined
}

object Merchant {
  @scala.inline
  def apply(
    additional_info: String = null,
    additional_info_label: String = null,
    address: Address = null,
    business_name: String = null,
    email: String = null,
    fax: Phone = null,
    first_name: String = null,
    last_name: String = null,
    phone: Phone = null,
    tax_id: String = null,
    website: String = null
  ): Merchant = {
    val __obj = js.Dynamic.literal()
    if (additional_info != null) __obj.updateDynamic("additional_info")(additional_info.asInstanceOf[js.Any])
    if (additional_info_label != null) __obj.updateDynamic("additional_info_label")(additional_info_label.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (business_name != null) __obj.updateDynamic("business_name")(business_name.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (fax != null) __obj.updateDynamic("fax")(fax.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (tax_id != null) __obj.updateDynamic("tax_id")(tax_id.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[Merchant]
  }
}

