package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var city: java.lang.String
  var country_code: java.lang.String
  var line1: java.lang.String
  var line2: js.UndefOr[java.lang.String] = js.undefined
  val normalization_status: js.UndefOr[java.lang.String] = js.undefined
  var phone: js.UndefOr[java.lang.String] = js.undefined
  var postal_code: java.lang.String
  var recipient_name: js.UndefOr[java.lang.String] = js.undefined
  var state: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    city: java.lang.String,
    country_code: java.lang.String,
    line1: java.lang.String,
    postal_code: java.lang.String,
    state: java.lang.String,
    line2: java.lang.String = null,
    normalization_status: java.lang.String = null,
    phone: java.lang.String = null,
    recipient_name: java.lang.String = null,
    `type`: java.lang.String = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("country_code")(country_code)
    __obj.updateDynamic("line1")(line1)
    __obj.updateDynamic("postal_code")(postal_code)
    __obj.updateDynamic("state")(state)
    if (line2 != null) __obj.updateDynamic("line2")(line2)
    if (normalization_status != null) __obj.updateDynamic("normalization_status")(normalization_status)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (recipient_name != null) __obj.updateDynamic("recipient_name")(recipient_name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Address]
  }
}

