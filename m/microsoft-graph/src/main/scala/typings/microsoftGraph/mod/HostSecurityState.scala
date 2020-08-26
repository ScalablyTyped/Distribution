package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostSecurityState extends js.Object {
  // Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
  var fqdn: js.UndefOr[String] = js.native
  var isAzureAdJoined: js.UndefOr[Boolean] = js.native
  var isAzureAdRegistered: js.UndefOr[Boolean] = js.native
  // True if the host is domain joined to an on-premises Active Directory domain.
  var isHybridAzureDomainJoined: js.UndefOr[Boolean] = js.native
  // The local host name, without the DNS domain name.
  var netBiosName: js.UndefOr[String] = js.native
  // Host Operating System. (For example, Windows10, MacOS, RHEL, etc.).
  var os: js.UndefOr[String] = js.native
  // Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
  var privateIpAddress: js.UndefOr[String] = js.native
  // Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
  var publicIpAddress: js.UndefOr[String] = js.native
  // Provider-generated/calculated risk score of the host. Recommended value range of 0-1, which equates to a percentage.
  var riskScore: js.UndefOr[String] = js.native
}

object HostSecurityState {
  @scala.inline
  def apply(): HostSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostSecurityState]
  }
  @scala.inline
  implicit class HostSecurityStateOps[Self <: HostSecurityState] (val x: Self) extends AnyVal {
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
    def setFqdn(value: String): Self = this.set("fqdn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFqdn: Self = this.set("fqdn", js.undefined)
    @scala.inline
    def setIsAzureAdJoined(value: Boolean): Self = this.set("isAzureAdJoined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAzureAdJoined: Self = this.set("isAzureAdJoined", js.undefined)
    @scala.inline
    def setIsAzureAdRegistered(value: Boolean): Self = this.set("isAzureAdRegistered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAzureAdRegistered: Self = this.set("isAzureAdRegistered", js.undefined)
    @scala.inline
    def setIsHybridAzureDomainJoined(value: Boolean): Self = this.set("isHybridAzureDomainJoined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHybridAzureDomainJoined: Self = this.set("isHybridAzureDomainJoined", js.undefined)
    @scala.inline
    def setNetBiosName(value: String): Self = this.set("netBiosName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetBiosName: Self = this.set("netBiosName", js.undefined)
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("privateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("privateIpAddress", js.undefined)
    @scala.inline
    def setPublicIpAddress(value: String): Self = this.set("publicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIpAddress: Self = this.set("publicIpAddress", js.undefined)
    @scala.inline
    def setRiskScore(value: String): Self = this.set("riskScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRiskScore: Self = this.set("riskScore", js.undefined)
  }
  
}

