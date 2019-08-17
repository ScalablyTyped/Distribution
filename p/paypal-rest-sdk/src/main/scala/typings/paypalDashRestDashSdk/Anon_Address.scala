package typings.paypalDashRestDashSdk

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: Address
  var business_name: js.UndefOr[String] = js.undefined
  var first_name: String
  var last_name: String
}

object Anon_Address {
  @scala.inline
  def apply(address: Address, first_name: String, last_name: String, business_name: String = null): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, first_name = first_name, last_name = last_name)
    if (business_name != null) __obj.updateDynamic("business_name")(business_name)
    __obj.asInstanceOf[Anon_Address]
  }
}

