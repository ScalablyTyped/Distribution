package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostSecurityState extends StObject {
  
  // Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
  var fqdn: js.UndefOr[NullableOption[String]] = js.undefined
  
  var isAzureAdJoined: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isAzureAdRegistered: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // True if the host is domain joined to an on-premises Active Directory domain.
  var isHybridAzureDomainJoined: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The local host name, without the DNS domain name.
  var netBiosName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Host Operating System. (For example, Windows10, MacOS, RHEL, etc.).
  var os: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
  var privateIpAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
  var publicIpAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Provider-generated/calculated risk score of the host. Recommended value range of 0-1, which equates to a percentage.
  var riskScore: js.UndefOr[NullableOption[String]] = js.undefined
}
object HostSecurityState {
  
  inline def apply(): HostSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostSecurityState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostSecurityState] (val x: Self) extends AnyVal {
    
    inline def setFqdn(value: NullableOption[String]): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
    
    inline def setFqdnNull: Self = StObject.set(x, "fqdn", null)
    
    inline def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
    
    inline def setIsAzureAdJoined(value: NullableOption[Boolean]): Self = StObject.set(x, "isAzureAdJoined", value.asInstanceOf[js.Any])
    
    inline def setIsAzureAdJoinedNull: Self = StObject.set(x, "isAzureAdJoined", null)
    
    inline def setIsAzureAdJoinedUndefined: Self = StObject.set(x, "isAzureAdJoined", js.undefined)
    
    inline def setIsAzureAdRegistered(value: NullableOption[Boolean]): Self = StObject.set(x, "isAzureAdRegistered", value.asInstanceOf[js.Any])
    
    inline def setIsAzureAdRegisteredNull: Self = StObject.set(x, "isAzureAdRegistered", null)
    
    inline def setIsAzureAdRegisteredUndefined: Self = StObject.set(x, "isAzureAdRegistered", js.undefined)
    
    inline def setIsHybridAzureDomainJoined(value: NullableOption[Boolean]): Self = StObject.set(x, "isHybridAzureDomainJoined", value.asInstanceOf[js.Any])
    
    inline def setIsHybridAzureDomainJoinedNull: Self = StObject.set(x, "isHybridAzureDomainJoined", null)
    
    inline def setIsHybridAzureDomainJoinedUndefined: Self = StObject.set(x, "isHybridAzureDomainJoined", js.undefined)
    
    inline def setNetBiosName(value: NullableOption[String]): Self = StObject.set(x, "netBiosName", value.asInstanceOf[js.Any])
    
    inline def setNetBiosNameNull: Self = StObject.set(x, "netBiosName", null)
    
    inline def setNetBiosNameUndefined: Self = StObject.set(x, "netBiosName", js.undefined)
    
    inline def setOs(value: NullableOption[String]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsNull: Self = StObject.set(x, "os", null)
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setPrivateIpAddress(value: NullableOption[String]): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressNull: Self = StObject.set(x, "privateIpAddress", null)
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
    
    inline def setPublicIpAddress(value: NullableOption[String]): Self = StObject.set(x, "publicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPublicIpAddressNull: Self = StObject.set(x, "publicIpAddress", null)
    
    inline def setPublicIpAddressUndefined: Self = StObject.set(x, "publicIpAddress", js.undefined)
    
    inline def setRiskScore(value: NullableOption[String]): Self = StObject.set(x, "riskScore", value.asInstanceOf[js.Any])
    
    inline def setRiskScoreNull: Self = StObject.set(x, "riskScore", null)
    
    inline def setRiskScoreUndefined: Self = StObject.set(x, "riskScore", js.undefined)
  }
}
