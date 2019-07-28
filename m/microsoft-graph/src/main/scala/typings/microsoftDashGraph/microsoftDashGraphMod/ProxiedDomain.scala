package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxiedDomain extends js.Object {
  // The IP address or FQDN
  var ipAddressOrFQDN: js.UndefOr[String] = js.undefined
  // Proxy IP or FQDN
  var proxy: js.UndefOr[String] = js.undefined
}

object ProxiedDomain {
  @scala.inline
  def apply(ipAddressOrFQDN: String = null, proxy: String = null): ProxiedDomain = {
    val __obj = js.Dynamic.literal()
    if (ipAddressOrFQDN != null) __obj.updateDynamic("ipAddressOrFQDN")(ipAddressOrFQDN)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[ProxiedDomain]
  }
}

