package typings.maxmind.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTypeResponse extends Response {
  val connection_type: String
  var ip_address: js.UndefOr[String] = js.undefined
}

object ConnectionTypeResponse {
  @scala.inline
  def apply(connection_type: String, ip_address: String = null): ConnectionTypeResponse = {
    val __obj = js.Dynamic.literal(connection_type = connection_type.asInstanceOf[js.Any])
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionTypeResponse]
  }
}

