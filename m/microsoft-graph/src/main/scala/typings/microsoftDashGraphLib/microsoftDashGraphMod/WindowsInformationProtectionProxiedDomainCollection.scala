package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionProxiedDomainCollection extends js.Object {
  // Display name
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Collection of proxied domains
  var proxiedDomains: js.UndefOr[js.Array[ProxiedDomain]] = js.undefined
}

object WindowsInformationProtectionProxiedDomainCollection {
  @scala.inline
  def apply(displayName: java.lang.String = null, proxiedDomains: js.Array[ProxiedDomain] = null): WindowsInformationProtectionProxiedDomainCollection = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (proxiedDomains != null) __obj.updateDynamic("proxiedDomains")(proxiedDomains)
    __obj.asInstanceOf[WindowsInformationProtectionProxiedDomainCollection]
  }
}

