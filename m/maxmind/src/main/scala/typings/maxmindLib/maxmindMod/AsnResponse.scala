package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsnResponse extends Response {
  val autonomous_system_number: scala.Double
  val autonomous_system_organization: java.lang.String
  var ip_address: js.UndefOr[java.lang.String] = js.undefined
}

object AsnResponse {
  @scala.inline
  def apply(
    autonomous_system_number: scala.Double,
    autonomous_system_organization: java.lang.String,
    ip_address: java.lang.String = null
  ): AsnResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number, autonomous_system_organization = autonomous_system_organization)
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address)
    __obj.asInstanceOf[AsnResponse]
  }
}

