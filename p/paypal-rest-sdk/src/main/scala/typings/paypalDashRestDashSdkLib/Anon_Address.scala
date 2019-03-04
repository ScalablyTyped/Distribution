package typings
package paypalDashRestDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Address
  var business_name: js.UndefOr[java.lang.String] = js.undefined
  var first_name: java.lang.String
  var last_name: java.lang.String
}

object Anon_Address {
  @scala.inline
  def apply(
    address: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Address,
    first_name: java.lang.String,
    last_name: java.lang.String,
    business_name: java.lang.String = null
  ): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, first_name = first_name, last_name = last_name)
    if (business_name != null) __obj.updateDynamic("business_name")(business_name)
    __obj.asInstanceOf[Anon_Address]
  }
}

