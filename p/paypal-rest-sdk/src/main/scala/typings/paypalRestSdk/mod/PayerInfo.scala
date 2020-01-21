package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayerInfo extends js.Object {
  var billing_address: js.UndefOr[Address] = js.undefined
  var birth_date: js.UndefOr[String] = js.undefined
  var country_code: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  val first_name: js.UndefOr[String] = js.undefined
  val last_name: js.UndefOr[String] = js.undefined
  val middle_name: js.UndefOr[String] = js.undefined
  val payer_id: js.UndefOr[String] = js.undefined
  val salutation: js.UndefOr[String] = js.undefined
  val shipping_address: js.UndefOr[Address] = js.undefined
  val suffix: js.UndefOr[String] = js.undefined
  var tax_id: js.UndefOr[String] = js.undefined
  var tax_id_type: js.UndefOr[String] = js.undefined
}

object PayerInfo {
  @scala.inline
  def apply(
    billing_address: Address = null,
    birth_date: String = null,
    country_code: String = null,
    email: String = null,
    first_name: String = null,
    last_name: String = null,
    middle_name: String = null,
    payer_id: String = null,
    salutation: String = null,
    shipping_address: Address = null,
    suffix: String = null,
    tax_id: String = null,
    tax_id_type: String = null
  ): PayerInfo = {
    val __obj = js.Dynamic.literal()
    if (billing_address != null) __obj.updateDynamic("billing_address")(billing_address.asInstanceOf[js.Any])
    if (birth_date != null) __obj.updateDynamic("birth_date")(birth_date.asInstanceOf[js.Any])
    if (country_code != null) __obj.updateDynamic("country_code")(country_code.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (middle_name != null) __obj.updateDynamic("middle_name")(middle_name.asInstanceOf[js.Any])
    if (payer_id != null) __obj.updateDynamic("payer_id")(payer_id.asInstanceOf[js.Any])
    if (salutation != null) __obj.updateDynamic("salutation")(salutation.asInstanceOf[js.Any])
    if (shipping_address != null) __obj.updateDynamic("shipping_address")(shipping_address.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (tax_id != null) __obj.updateDynamic("tax_id")(tax_id.asInstanceOf[js.Any])
    if (tax_id_type != null) __obj.updateDynamic("tax_id_type")(tax_id_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayerInfo]
  }
}

