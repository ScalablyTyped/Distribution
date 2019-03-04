package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTypeResponse extends Response {
  val connection_type: java.lang.String
  var ip_address: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionTypeResponse {
  @scala.inline
  def apply(connection_type: java.lang.String, ip_address: java.lang.String = null): ConnectionTypeResponse = {
    val __obj = js.Dynamic.literal(connection_type = connection_type)
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address)
    __obj.asInstanceOf[ConnectionTypeResponse]
  }
}

