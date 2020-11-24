package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostSecurityState extends js.Object {
  
  // Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
  var fqdn: js.UndefOr[NullableOption[String]] = js.native
  
  var isAzureAdJoined: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var isAzureAdRegistered: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // True if the host is domain joined to an on-premises Active Directory domain.
  var isHybridAzureDomainJoined: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The local host name, without the DNS domain name.
  var netBiosName: js.UndefOr[NullableOption[String]] = js.native
  
  // Host Operating System. (For example, Windows10, MacOS, RHEL, etc.).
  var os: js.UndefOr[NullableOption[String]] = js.native
  
  // Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
  var privateIpAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
  var publicIpAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Provider-generated/calculated risk score of the host. Recommended value range of 0-1, which equates to a percentage.
  var riskScore: js.UndefOr[NullableOption[String]] = js.native
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
    def setFqdn(value: NullableOption[String]): Self = this.set("fqdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFqdn: Self = this.set("fqdn", js.undefined)
    
    @scala.inline
    def setFqdnNull: Self = this.set("fqdn", null)
    
    @scala.inline
    def setIsAzureAdJoined(value: NullableOption[Boolean]): Self = this.set("isAzureAdJoined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAzureAdJoined: Self = this.set("isAzureAdJoined", js.undefined)
    
    @scala.inline
    def setIsAzureAdJoinedNull: Self = this.set("isAzureAdJoined", null)
    
    @scala.inline
    def setIsAzureAdRegistered(value: NullableOption[Boolean]): Self = this.set("isAzureAdRegistered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAzureAdRegistered: Self = this.set("isAzureAdRegistered", js.undefined)
    
    @scala.inline
    def setIsAzureAdRegisteredNull: Self = this.set("isAzureAdRegistered", null)
    
    @scala.inline
    def setIsHybridAzureDomainJoined(value: NullableOption[Boolean]): Self = this.set("isHybridAzureDomainJoined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHybridAzureDomainJoined: Self = this.set("isHybridAzureDomainJoined", js.undefined)
    
    @scala.inline
    def setIsHybridAzureDomainJoinedNull: Self = this.set("isHybridAzureDomainJoined", null)
    
    @scala.inline
    def setNetBiosName(value: NullableOption[String]): Self = this.set("netBiosName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetBiosName: Self = this.set("netBiosName", js.undefined)
    
    @scala.inline
    def setNetBiosNameNull: Self = this.set("netBiosName", null)
    
    @scala.inline
    def setOs(value: NullableOption[String]): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setOsNull: Self = this.set("os", null)
    
    @scala.inline
    def setPrivateIpAddress(value: NullableOption[String]): Self = this.set("privateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("privateIpAddress", js.undefined)
    
    @scala.inline
    def setPrivateIpAddressNull: Self = this.set("privateIpAddress", null)
    
    @scala.inline
    def setPublicIpAddress(value: NullableOption[String]): Self = this.set("publicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIpAddress: Self = this.set("publicIpAddress", js.undefined)
    
    @scala.inline
    def setPublicIpAddressNull: Self = this.set("publicIpAddress", null)
    
    @scala.inline
    def setRiskScore(value: NullableOption[String]): Self = this.set("riskScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskScore: Self = this.set("riskScore", js.undefined)
    
    @scala.inline
    def setRiskScoreNull: Self = this.set("riskScore", null)
  }
}
