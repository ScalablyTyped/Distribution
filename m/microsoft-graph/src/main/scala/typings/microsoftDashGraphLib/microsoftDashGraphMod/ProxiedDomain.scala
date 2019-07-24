package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxiedDomain extends js.Object {
  // The IP address or FQDN
  var ipAddressOrFQDN: js.UndefOr[java.lang.String] = js.undefined
  // Proxy IP or FQDN
  var proxy: js.UndefOr[java.lang.String] = js.undefined
}

object ProxiedDomain {
  @scala.inline
  def apply(ipAddressOrFQDN: java.lang.String = null, proxy: java.lang.String = null): ProxiedDomain = {
    val __obj = js.Dynamic.literal()
    if (ipAddressOrFQDN != null) __obj.updateDynamic("ipAddressOrFQDN")(ipAddressOrFQDN)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[ProxiedDomain]
  }
}

