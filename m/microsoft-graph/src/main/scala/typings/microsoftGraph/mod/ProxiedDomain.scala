package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxiedDomain extends js.Object {
  // The IP address or FQDN
  var ipAddressOrFQDN: js.UndefOr[String] = js.native
  // Proxy IP or FQDN
  var proxy: js.UndefOr[String] = js.native
}

object ProxiedDomain {
  @scala.inline
  def apply(): ProxiedDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxiedDomain]
  }
  @scala.inline
  implicit class ProxiedDomainOps[Self <: ProxiedDomain] (val x: Self) extends AnyVal {
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
    def setIpAddressOrFQDN(value: String): Self = this.set("ipAddressOrFQDN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddressOrFQDN: Self = this.set("ipAddressOrFQDN", js.undefined)
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
  
}

