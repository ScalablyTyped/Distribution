package typings.maxmind.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainResponse extends Response {
  val domain: String
  var ip_address: js.UndefOr[String] = js.undefined
}

object DomainResponse {
  @scala.inline
  def apply(domain: String, ip_address: String = null): DomainResponse = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainResponse]
  }
}

