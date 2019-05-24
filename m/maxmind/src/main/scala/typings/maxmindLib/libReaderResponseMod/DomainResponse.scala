package typings
package maxmindLib.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainResponse extends Response {
  val domain: java.lang.String
  var ip_address: js.UndefOr[java.lang.String] = js.undefined
}

object DomainResponse {
  @scala.inline
  def apply(domain: java.lang.String, ip_address: java.lang.String = null): DomainResponse = {
    val __obj = js.Dynamic.literal(domain = domain)
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address)
    __obj.asInstanceOf[DomainResponse]
  }
}

