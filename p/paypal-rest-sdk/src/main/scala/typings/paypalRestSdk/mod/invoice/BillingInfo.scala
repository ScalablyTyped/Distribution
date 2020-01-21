package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Address
import typings.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingInfo extends Person {
  var additional_info: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var notification_channel: js.UndefOr[String] = js.undefined
}

object BillingInfo {
  @scala.inline
  def apply(
    additional_info: String = null,
    address: Address = null,
    business_name: String = null,
    email: String = null,
    first_name: String = null,
    language: String = null,
    last_name: String = null,
    notification_channel: String = null,
    phone: Phone = null,
    website: String = null
  ): BillingInfo = {
    val __obj = js.Dynamic.literal()
    if (additional_info != null) __obj.updateDynamic("additional_info")(additional_info.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (business_name != null) __obj.updateDynamic("business_name")(business_name.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (notification_channel != null) __obj.updateDynamic("notification_channel")(notification_channel.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingInfo]
  }
}

