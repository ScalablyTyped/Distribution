package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConnection extends StObject {
  
  // Name of the application managing the network connection (for example, Facebook or SMTP).
  var applicationName: js.UndefOr[NullableOption[String]] = js.native
  
  // Destination IP address (of the network connection).
  var destinationAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Destination domain portion of the destination URL. (for example 'www.contoso.com').
  var destinationDomain: js.UndefOr[NullableOption[String]] = js.native
  
  // Location (by IP address mapping) associated with the destination of a network connection.
  var destinationLocation: js.UndefOr[NullableOption[String]] = js.native
  
  // Destination port (of the network connection).
  var destinationPort: js.UndefOr[NullableOption[String]] = js.native
  
  // Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
  var destinationUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Network connection direction. Possible values are: unknown, inbound, outbound.
  var direction: js.UndefOr[NullableOption[ConnectionDirection]] = js.native
  
  /**
    * Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var domainRegisteredDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was
    * tampered with).
    */
  var localDnsName: js.UndefOr[NullableOption[String]] = js.native
  
  // Network Address Translation destination IP address.
  var natDestinationAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Network Address Translation destination port.
  var natDestinationPort: js.UndefOr[NullableOption[String]] = js.native
  
  // Network Address Translation source IP address.
  var natSourceAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Network Address Translation source port.
  var natSourcePort: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader,
    * ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader,
    * ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
    */
  var protocol: js.UndefOr[NullableOption[SecurityNetworkProtocol]] = js.native
  
  /**
    * Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[NullableOption[String]] = js.native
  
  // Source (i.e. origin) IP address (of the network connection).
  var sourceAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Location (by IP address mapping) associated with the source of a network connection.
  var sourceLocation: js.UndefOr[NullableOption[String]] = js.native
  
  // Source (i.e. origin) IP port (of the network connection).
  var sourcePort: js.UndefOr[NullableOption[String]] = js.native
  
  // Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
  var status: js.UndefOr[NullableOption[ConnectionStatus]] = js.native
  
  // Parameters (suffix) of the destination URL.
  var urlParameters: js.UndefOr[NullableOption[String]] = js.native
}
object NetworkConnection {
  
  @scala.inline
  def apply(): NetworkConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConnection]
  }
  
  @scala.inline
  implicit class NetworkConnectionMutableBuilder[Self <: NetworkConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: NullableOption[String]): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameNull: Self = StObject.set(x, "applicationName", null)
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setDestinationAddress(value: NullableOption[String]): Self = StObject.set(x, "destinationAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationAddressNull: Self = StObject.set(x, "destinationAddress", null)
    
    @scala.inline
    def setDestinationAddressUndefined: Self = StObject.set(x, "destinationAddress", js.undefined)
    
    @scala.inline
    def setDestinationDomain(value: NullableOption[String]): Self = StObject.set(x, "destinationDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDomainNull: Self = StObject.set(x, "destinationDomain", null)
    
    @scala.inline
    def setDestinationDomainUndefined: Self = StObject.set(x, "destinationDomain", js.undefined)
    
    @scala.inline
    def setDestinationLocation(value: NullableOption[String]): Self = StObject.set(x, "destinationLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationLocationNull: Self = StObject.set(x, "destinationLocation", null)
    
    @scala.inline
    def setDestinationLocationUndefined: Self = StObject.set(x, "destinationLocation", js.undefined)
    
    @scala.inline
    def setDestinationPort(value: NullableOption[String]): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPortNull: Self = StObject.set(x, "destinationPort", null)
    
    @scala.inline
    def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    @scala.inline
    def setDestinationUrl(value: NullableOption[String]): Self = StObject.set(x, "destinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUrlNull: Self = StObject.set(x, "destinationUrl", null)
    
    @scala.inline
    def setDestinationUrlUndefined: Self = StObject.set(x, "destinationUrl", js.undefined)
    
    @scala.inline
    def setDirection(value: NullableOption[ConnectionDirection]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDomainRegisteredDateTime(value: NullableOption[String]): Self = StObject.set(x, "domainRegisteredDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainRegisteredDateTimeNull: Self = StObject.set(x, "domainRegisteredDateTime", null)
    
    @scala.inline
    def setDomainRegisteredDateTimeUndefined: Self = StObject.set(x, "domainRegisteredDateTime", js.undefined)
    
    @scala.inline
    def setLocalDnsName(value: NullableOption[String]): Self = StObject.set(x, "localDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalDnsNameNull: Self = StObject.set(x, "localDnsName", null)
    
    @scala.inline
    def setLocalDnsNameUndefined: Self = StObject.set(x, "localDnsName", js.undefined)
    
    @scala.inline
    def setNatDestinationAddress(value: NullableOption[String]): Self = StObject.set(x, "natDestinationAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatDestinationAddressNull: Self = StObject.set(x, "natDestinationAddress", null)
    
    @scala.inline
    def setNatDestinationAddressUndefined: Self = StObject.set(x, "natDestinationAddress", js.undefined)
    
    @scala.inline
    def setNatDestinationPort(value: NullableOption[String]): Self = StObject.set(x, "natDestinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatDestinationPortNull: Self = StObject.set(x, "natDestinationPort", null)
    
    @scala.inline
    def setNatDestinationPortUndefined: Self = StObject.set(x, "natDestinationPort", js.undefined)
    
    @scala.inline
    def setNatSourceAddress(value: NullableOption[String]): Self = StObject.set(x, "natSourceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatSourceAddressNull: Self = StObject.set(x, "natSourceAddress", null)
    
    @scala.inline
    def setNatSourceAddressUndefined: Self = StObject.set(x, "natSourceAddress", js.undefined)
    
    @scala.inline
    def setNatSourcePort(value: NullableOption[String]): Self = StObject.set(x, "natSourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatSourcePortNull: Self = StObject.set(x, "natSourcePort", null)
    
    @scala.inline
    def setNatSourcePortUndefined: Self = StObject.set(x, "natSourcePort", js.undefined)
    
    @scala.inline
    def setProtocol(value: NullableOption[SecurityNetworkProtocol]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setRiskScore(value: NullableOption[String]): Self = StObject.set(x, "riskScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskScoreNull: Self = StObject.set(x, "riskScore", null)
    
    @scala.inline
    def setRiskScoreUndefined: Self = StObject.set(x, "riskScore", js.undefined)
    
    @scala.inline
    def setSourceAddress(value: NullableOption[String]): Self = StObject.set(x, "sourceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAddressNull: Self = StObject.set(x, "sourceAddress", null)
    
    @scala.inline
    def setSourceAddressUndefined: Self = StObject.set(x, "sourceAddress", js.undefined)
    
    @scala.inline
    def setSourceLocation(value: NullableOption[String]): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocationNull: Self = StObject.set(x, "sourceLocation", null)
    
    @scala.inline
    def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    @scala.inline
    def setSourcePort(value: NullableOption[String]): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePortNull: Self = StObject.set(x, "sourcePort", null)
    
    @scala.inline
    def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
    
    @scala.inline
    def setStatus(value: NullableOption[ConnectionStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUrlParameters(value: NullableOption[String]): Self = StObject.set(x, "urlParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlParametersNull: Self = StObject.set(x, "urlParameters", null)
    
    @scala.inline
    def setUrlParametersUndefined: Self = StObject.set(x, "urlParameters", js.undefined)
  }
}
