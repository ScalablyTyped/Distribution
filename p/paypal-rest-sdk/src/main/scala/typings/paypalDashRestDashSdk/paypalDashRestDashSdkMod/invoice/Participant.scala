package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Address
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Participant extends Person {
  var additional_info: js.UndefOr[String] = js.undefined
  @JSName("email")
  var email_Participant: String
  var fax: js.UndefOr[Phone] = js.undefined
}

object Participant {
  @scala.inline
  def apply(
    email: String,
    additional_info: String = null,
    address: Address = null,
    business_name: String = null,
    fax: Phone = null,
    first_name: String = null,
    last_name: String = null,
    phone: Phone = null,
    website: String = null
  ): Participant = {
    val __obj = js.Dynamic.literal(email = email)
    if (additional_info != null) __obj.updateDynamic("additional_info")(additional_info)
    if (address != null) __obj.updateDynamic("address")(address)
    if (business_name != null) __obj.updateDynamic("business_name")(business_name)
    if (fax != null) __obj.updateDynamic("fax")(fax)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[Participant]
  }
}

