package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayerInfo extends js.Object {
  var billing_address: js.UndefOr[Address] = js.undefined
  var birth_date: js.UndefOr[java.lang.String] = js.undefined
  var country_code: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  val first_name: js.UndefOr[java.lang.String] = js.undefined
  val last_name: js.UndefOr[java.lang.String] = js.undefined
  val middle_name: js.UndefOr[java.lang.String] = js.undefined
  val payer_id: js.UndefOr[java.lang.String] = js.undefined
  val salutation: js.UndefOr[java.lang.String] = js.undefined
  val shipping_address: js.UndefOr[Address] = js.undefined
  val suffix: js.UndefOr[java.lang.String] = js.undefined
  var tax_id: js.UndefOr[java.lang.String] = js.undefined
  var tax_id_type: js.UndefOr[java.lang.String] = js.undefined
}

object PayerInfo {
  @scala.inline
  def apply(
    billing_address: Address = null,
    birth_date: java.lang.String = null,
    country_code: java.lang.String = null,
    email: java.lang.String = null,
    first_name: java.lang.String = null,
    last_name: java.lang.String = null,
    middle_name: java.lang.String = null,
    payer_id: java.lang.String = null,
    salutation: java.lang.String = null,
    shipping_address: Address = null,
    suffix: java.lang.String = null,
    tax_id: java.lang.String = null,
    tax_id_type: java.lang.String = null
  ): PayerInfo = {
    val __obj = js.Dynamic.literal()
    if (billing_address != null) __obj.updateDynamic("billing_address")(billing_address)
    if (birth_date != null) __obj.updateDynamic("birth_date")(birth_date)
    if (country_code != null) __obj.updateDynamic("country_code")(country_code)
    if (email != null) __obj.updateDynamic("email")(email)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (middle_name != null) __obj.updateDynamic("middle_name")(middle_name)
    if (payer_id != null) __obj.updateDynamic("payer_id")(payer_id)
    if (salutation != null) __obj.updateDynamic("salutation")(salutation)
    if (shipping_address != null) __obj.updateDynamic("shipping_address")(shipping_address)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (tax_id != null) __obj.updateDynamic("tax_id")(tax_id)
    if (tax_id_type != null) __obj.updateDynamic("tax_id_type")(tax_id_type)
    __obj.asInstanceOf[PayerInfo]
  }
}

