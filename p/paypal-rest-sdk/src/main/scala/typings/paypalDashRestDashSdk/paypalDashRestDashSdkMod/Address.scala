package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var city: String
  var country_code: String
  var line1: String
  var line2: js.UndefOr[String] = js.undefined
  val normalization_status: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
  var postal_code: String
  var recipient_name: js.UndefOr[String] = js.undefined
  var state: String
  var `type`: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    city: String,
    country_code: String,
    line1: String,
    postal_code: String,
    state: String,
    line2: String = null,
    normalization_status: String = null,
    phone: String = null,
    recipient_name: String = null,
    `type`: String = null
  ): Address = {
    val __obj = js.Dynamic.literal(city = city, country_code = country_code, line1 = line1, postal_code = postal_code, state = state)
    if (line2 != null) __obj.updateDynamic("line2")(line2)
    if (normalization_status != null) __obj.updateDynamic("normalization_status")(normalization_status)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (recipient_name != null) __obj.updateDynamic("recipient_name")(recipient_name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Address]
  }
}

