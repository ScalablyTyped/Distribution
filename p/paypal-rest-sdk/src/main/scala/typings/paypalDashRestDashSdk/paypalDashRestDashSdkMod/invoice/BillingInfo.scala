package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Address
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Phone
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
    if (additional_info != null) __obj.updateDynamic("additional_info")(additional_info)
    if (address != null) __obj.updateDynamic("address")(address)
    if (business_name != null) __obj.updateDynamic("business_name")(business_name)
    if (email != null) __obj.updateDynamic("email")(email)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (language != null) __obj.updateDynamic("language")(language)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (notification_channel != null) __obj.updateDynamic("notification_channel")(notification_channel)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[BillingInfo]
  }
}

