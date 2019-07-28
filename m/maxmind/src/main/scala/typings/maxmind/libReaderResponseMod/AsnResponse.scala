package typings.maxmind.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsnResponse extends Response {
  val autonomous_system_number: Double
  val autonomous_system_organization: String
  var ip_address: js.UndefOr[String] = js.undefined
}

object AsnResponse {
  @scala.inline
  def apply(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    ip_address: String = null
  ): AsnResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number, autonomous_system_organization = autonomous_system_organization)
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address)
    __obj.asInstanceOf[AsnResponse]
  }
}

