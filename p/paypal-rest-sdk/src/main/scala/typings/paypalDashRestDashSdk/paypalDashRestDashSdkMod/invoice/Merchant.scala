package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Address
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Phone
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
    if (additional_info != null) __obj.updateDynamic("additional_info")(additional_info)
    if (additional_info_label != null) __obj.updateDynamic("additional_info_label")(additional_info_label)
    if (address != null) __obj.updateDynamic("address")(address)
    if (business_name != null) __obj.updateDynamic("business_name")(business_name)
    if (email != null) __obj.updateDynamic("email")(email)
    if (fax != null) __obj.updateDynamic("fax")(fax)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (tax_id != null) __obj.updateDynamic("tax_id")(tax_id)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[Merchant]
  }
}

