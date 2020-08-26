package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsInformationProtectionProxiedDomainCollection extends js.Object {
  // Display name
  var displayName: js.UndefOr[String] = js.native
  // Collection of proxied domains
  var proxiedDomains: js.UndefOr[js.Array[ProxiedDomain]] = js.native
}

object WindowsInformationProtectionProxiedDomainCollection {
  @scala.inline
  def apply(): WindowsInformationProtectionProxiedDomainCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionProxiedDomainCollection]
  }
  @scala.inline
  implicit class WindowsInformationProtectionProxiedDomainCollectionOps[Self <: WindowsInformationProtectionProxiedDomainCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setProxiedDomainsVarargs(value: ProxiedDomain*): Self = this.set("proxiedDomains", js.Array(value :_*))
    @scala.inline
    def setProxiedDomains(value: js.Array[ProxiedDomain]): Self = this.set("proxiedDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxiedDomains: Self = this.set("proxiedDomains", js.undefined)
  }
  
}

