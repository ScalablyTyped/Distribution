package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostSecurityState extends StObject {
  
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
  implicit class HostSecurityStateMutableBuilder[Self <: HostSecurityState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFqdn(value: NullableOption[String]): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFqdnNull: Self = StObject.set(x, "fqdn", null)
    
    @scala.inline
    def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
    
    @scala.inline
    def setIsAzureAdJoined(value: NullableOption[Boolean]): Self = StObject.set(x, "isAzureAdJoined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAzureAdJoinedNull: Self = StObject.set(x, "isAzureAdJoined", null)
    
    @scala.inline
    def setIsAzureAdJoinedUndefined: Self = StObject.set(x, "isAzureAdJoined", js.undefined)
    
    @scala.inline
    def setIsAzureAdRegistered(value: NullableOption[Boolean]): Self = StObject.set(x, "isAzureAdRegistered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAzureAdRegisteredNull: Self = StObject.set(x, "isAzureAdRegistered", null)
    
    @scala.inline
    def setIsAzureAdRegisteredUndefined: Self = StObject.set(x, "isAzureAdRegistered", js.undefined)
    
    @scala.inline
    def setIsHybridAzureDomainJoined(value: NullableOption[Boolean]): Self = StObject.set(x, "isHybridAzureDomainJoined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHybridAzureDomainJoinedNull: Self = StObject.set(x, "isHybridAzureDomainJoined", null)
    
    @scala.inline
    def setIsHybridAzureDomainJoinedUndefined: Self = StObject.set(x, "isHybridAzureDomainJoined", js.undefined)
    
    @scala.inline
    def setNetBiosName(value: NullableOption[String]): Self = StObject.set(x, "netBiosName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetBiosNameNull: Self = StObject.set(x, "netBiosName", null)
    
    @scala.inline
    def setNetBiosNameUndefined: Self = StObject.set(x, "netBiosName", js.undefined)
    
    @scala.inline
    def setOs(value: NullableOption[String]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsNull: Self = StObject.set(x, "os", null)
    
    @scala.inline
    def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: NullableOption[String]): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressNull: Self = StObject.set(x, "privateIpAddress", null)
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
    
    @scala.inline
    def setPublicIpAddress(value: NullableOption[String]): Self = StObject.set(x, "publicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpAddressNull: Self = StObject.set(x, "publicIpAddress", null)
    
    @scala.inline
    def setPublicIpAddressUndefined: Self = StObject.set(x, "publicIpAddress", js.undefined)
    
    @scala.inline
    def setRiskScore(value: NullableOption[String]): Self = StObject.set(x, "riskScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskScoreNull: Self = StObject.set(x, "riskScore", null)
    
    @scala.inline
    def setRiskScoreUndefined: Self = StObject.set(x, "riskScore", js.undefined)
  }
}
