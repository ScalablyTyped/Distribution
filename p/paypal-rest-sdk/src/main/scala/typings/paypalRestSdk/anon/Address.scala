package typings.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: typings.paypalRestSdk.mod.Address
  var business_name: js.UndefOr[String] = js.undefined
  var first_name: String
  var last_name: String
}

object Address {
  @scala.inline
  def apply(
    address: typings.paypalRestSdk.mod.Address,
    first_name: String,
    last_name: String,
    business_name: String = null
  ): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
    if (business_name != null) __obj.updateDynamic("business_name")(business_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

