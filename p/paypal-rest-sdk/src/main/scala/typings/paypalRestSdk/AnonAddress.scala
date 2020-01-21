package typings.paypalRestSdk

import typings.paypalRestSdk.mod.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: Address
  var business_name: js.UndefOr[String] = js.undefined
  var first_name: String
  var last_name: String
}

object AnonAddress {
  @scala.inline
  def apply(address: Address, first_name: String, last_name: String, business_name: String = null): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
    if (business_name != null) __obj.updateDynamic("business_name")(business_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

