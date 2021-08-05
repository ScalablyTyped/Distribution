package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConnection extends StObject {
  
  // Name of the application managing the network connection (for example, Facebook or SMTP).
  var applicationName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Destination IP address (of the network connection).
  var destinationAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Destination domain portion of the destination URL. (for example 'www.contoso.com').
  var destinationDomain: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Location (by IP address mapping) associated with the destination of a network connection.
  var destinationLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Destination port (of the network connection).
  var destinationPort: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
  var destinationUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Network connection direction. Possible values are: unknown, inbound, outbound.
  var direction: js.UndefOr[NullableOption[ConnectionDirection]] = js.undefined
  
  /**
    * Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var domainRegisteredDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was
    * tampered with).
    */
  var localDnsName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Network Address Translation destination IP address.
  var natDestinationAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Network Address Translation destination port.
  var natDestinationPort: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Network Address Translation source IP address.
  var natSourceAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Network Address Translation source port.
  var natSourcePort: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader,
    * ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader,
    * ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
    */
  var protocol: js.UndefOr[NullableOption[SecurityNetworkProtocol]] = js.undefined
  
  /**
    * Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Source (i.e. origin) IP address (of the network connection).
  var sourceAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Location (by IP address mapping) associated with the source of a network connection.
  var sourceLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Source (i.e. origin) IP port (of the network connection).
  var sourcePort: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
  var status: js.UndefOr[NullableOption[ConnectionStatus]] = js.undefined
  
  // Parameters (suffix) of the destination URL.
  var urlParameters: js.UndefOr[NullableOption[String]] = js.undefined
}
object NetworkConnection {
  
  inline def apply(): NetworkConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConnection]
  }
  
  extension [Self <: NetworkConnection](x: Self) {
    
    inline def setApplicationName(value: NullableOption[String]): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameNull: Self = StObject.set(x, "applicationName", null)
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setDestinationAddress(value: NullableOption[String]): Self = StObject.set(x, "destinationAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressNull: Self = StObject.set(x, "destinationAddress", null)
    
    inline def setDestinationAddressUndefined: Self = StObject.set(x, "destinationAddress", js.undefined)
    
    inline def setDestinationDomain(value: NullableOption[String]): Self = StObject.set(x, "destinationDomain", value.asInstanceOf[js.Any])
    
    inline def setDestinationDomainNull: Self = StObject.set(x, "destinationDomain", null)
    
    inline def setDestinationDomainUndefined: Self = StObject.set(x, "destinationDomain", js.undefined)
    
    inline def setDestinationLocation(value: NullableOption[String]): Self = StObject.set(x, "destinationLocation", value.asInstanceOf[js.Any])
    
    inline def setDestinationLocationNull: Self = StObject.set(x, "destinationLocation", null)
    
    inline def setDestinationLocationUndefined: Self = StObject.set(x, "destinationLocation", js.undefined)
    
    inline def setDestinationPort(value: NullableOption[String]): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortNull: Self = StObject.set(x, "destinationPort", null)
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    inline def setDestinationUrl(value: NullableOption[String]): Self = StObject.set(x, "destinationUrl", value.asInstanceOf[js.Any])
    
    inline def setDestinationUrlNull: Self = StObject.set(x, "destinationUrl", null)
    
    inline def setDestinationUrlUndefined: Self = StObject.set(x, "destinationUrl", js.undefined)
    
    inline def setDirection(value: NullableOption[ConnectionDirection]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDomainRegisteredDateTime(value: NullableOption[String]): Self = StObject.set(x, "domainRegisteredDateTime", value.asInstanceOf[js.Any])
    
    inline def setDomainRegisteredDateTimeNull: Self = StObject.set(x, "domainRegisteredDateTime", null)
    
    inline def setDomainRegisteredDateTimeUndefined: Self = StObject.set(x, "domainRegisteredDateTime", js.undefined)
    
    inline def setLocalDnsName(value: NullableOption[String]): Self = StObject.set(x, "localDnsName", value.asInstanceOf[js.Any])
    
    inline def setLocalDnsNameNull: Self = StObject.set(x, "localDnsName", null)
    
    inline def setLocalDnsNameUndefined: Self = StObject.set(x, "localDnsName", js.undefined)
    
    inline def setNatDestinationAddress(value: NullableOption[String]): Self = StObject.set(x, "natDestinationAddress", value.asInstanceOf[js.Any])
    
    inline def setNatDestinationAddressNull: Self = StObject.set(x, "natDestinationAddress", null)
    
    inline def setNatDestinationAddressUndefined: Self = StObject.set(x, "natDestinationAddress", js.undefined)
    
    inline def setNatDestinationPort(value: NullableOption[String]): Self = StObject.set(x, "natDestinationPort", value.asInstanceOf[js.Any])
    
    inline def setNatDestinationPortNull: Self = StObject.set(x, "natDestinationPort", null)
    
    inline def setNatDestinationPortUndefined: Self = StObject.set(x, "natDestinationPort", js.undefined)
    
    inline def setNatSourceAddress(value: NullableOption[String]): Self = StObject.set(x, "natSourceAddress", value.asInstanceOf[js.Any])
    
    inline def setNatSourceAddressNull: Self = StObject.set(x, "natSourceAddress", null)
    
    inline def setNatSourceAddressUndefined: Self = StObject.set(x, "natSourceAddress", js.undefined)
    
    inline def setNatSourcePort(value: NullableOption[String]): Self = StObject.set(x, "natSourcePort", value.asInstanceOf[js.Any])
    
    inline def setNatSourcePortNull: Self = StObject.set(x, "natSourcePort", null)
    
    inline def setNatSourcePortUndefined: Self = StObject.set(x, "natSourcePort", js.undefined)
    
    inline def setProtocol(value: NullableOption[SecurityNetworkProtocol]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setRiskScore(value: NullableOption[String]): Self = StObject.set(x, "riskScore", value.asInstanceOf[js.Any])
    
    inline def setRiskScoreNull: Self = StObject.set(x, "riskScore", null)
    
    inline def setRiskScoreUndefined: Self = StObject.set(x, "riskScore", js.undefined)
    
    inline def setSourceAddress(value: NullableOption[String]): Self = StObject.set(x, "sourceAddress", value.asInstanceOf[js.Any])
    
    inline def setSourceAddressNull: Self = StObject.set(x, "sourceAddress", null)
    
    inline def setSourceAddressUndefined: Self = StObject.set(x, "sourceAddress", js.undefined)
    
    inline def setSourceLocation(value: NullableOption[String]): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNull: Self = StObject.set(x, "sourceLocation", null)
    
    inline def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    inline def setSourcePort(value: NullableOption[String]): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    inline def setSourcePortNull: Self = StObject.set(x, "sourcePort", null)
    
    inline def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
    
    inline def setStatus(value: NullableOption[ConnectionStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUrlParameters(value: NullableOption[String]): Self = StObject.set(x, "urlParameters", value.asInstanceOf[js.Any])
    
    inline def setUrlParametersNull: Self = StObject.set(x, "urlParameters", null)
    
    inline def setUrlParametersUndefined: Self = StObject.set(x, "urlParameters", js.undefined)
  }
}
