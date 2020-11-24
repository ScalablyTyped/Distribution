package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConnection extends js.Object {
  
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
  implicit class NetworkConnectionOps[Self <: NetworkConnection] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: NullableOption[String]): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    
    @scala.inline
    def setApplicationNameNull: Self = this.set("applicationName", null)
    
    @scala.inline
    def setDestinationAddress(value: NullableOption[String]): Self = this.set("destinationAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationAddress: Self = this.set("destinationAddress", js.undefined)
    
    @scala.inline
    def setDestinationAddressNull: Self = this.set("destinationAddress", null)
    
    @scala.inline
    def setDestinationDomain(value: NullableOption[String]): Self = this.set("destinationDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationDomain: Self = this.set("destinationDomain", js.undefined)
    
    @scala.inline
    def setDestinationDomainNull: Self = this.set("destinationDomain", null)
    
    @scala.inline
    def setDestinationLocation(value: NullableOption[String]): Self = this.set("destinationLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationLocation: Self = this.set("destinationLocation", js.undefined)
    
    @scala.inline
    def setDestinationLocationNull: Self = this.set("destinationLocation", null)
    
    @scala.inline
    def setDestinationPort(value: NullableOption[String]): Self = this.set("destinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPort: Self = this.set("destinationPort", js.undefined)
    
    @scala.inline
    def setDestinationPortNull: Self = this.set("destinationPort", null)
    
    @scala.inline
    def setDestinationUrl(value: NullableOption[String]): Self = this.set("destinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationUrl: Self = this.set("destinationUrl", js.undefined)
    
    @scala.inline
    def setDestinationUrlNull: Self = this.set("destinationUrl", null)
    
    @scala.inline
    def setDirection(value: NullableOption[ConnectionDirection]): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDirectionNull: Self = this.set("direction", null)
    
    @scala.inline
    def setDomainRegisteredDateTime(value: NullableOption[String]): Self = this.set("domainRegisteredDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainRegisteredDateTime: Self = this.set("domainRegisteredDateTime", js.undefined)
    
    @scala.inline
    def setDomainRegisteredDateTimeNull: Self = this.set("domainRegisteredDateTime", null)
    
    @scala.inline
    def setLocalDnsName(value: NullableOption[String]): Self = this.set("localDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalDnsName: Self = this.set("localDnsName", js.undefined)
    
    @scala.inline
    def setLocalDnsNameNull: Self = this.set("localDnsName", null)
    
    @scala.inline
    def setNatDestinationAddress(value: NullableOption[String]): Self = this.set("natDestinationAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatDestinationAddress: Self = this.set("natDestinationAddress", js.undefined)
    
    @scala.inline
    def setNatDestinationAddressNull: Self = this.set("natDestinationAddress", null)
    
    @scala.inline
    def setNatDestinationPort(value: NullableOption[String]): Self = this.set("natDestinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatDestinationPort: Self = this.set("natDestinationPort", js.undefined)
    
    @scala.inline
    def setNatDestinationPortNull: Self = this.set("natDestinationPort", null)
    
    @scala.inline
    def setNatSourceAddress(value: NullableOption[String]): Self = this.set("natSourceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatSourceAddress: Self = this.set("natSourceAddress", js.undefined)
    
    @scala.inline
    def setNatSourceAddressNull: Self = this.set("natSourceAddress", null)
    
    @scala.inline
    def setNatSourcePort(value: NullableOption[String]): Self = this.set("natSourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatSourcePort: Self = this.set("natSourcePort", js.undefined)
    
    @scala.inline
    def setNatSourcePortNull: Self = this.set("natSourcePort", null)
    
    @scala.inline
    def setProtocol(value: NullableOption[SecurityNetworkProtocol]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setProtocolNull: Self = this.set("protocol", null)
    
    @scala.inline
    def setRiskScore(value: NullableOption[String]): Self = this.set("riskScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskScore: Self = this.set("riskScore", js.undefined)
    
    @scala.inline
    def setRiskScoreNull: Self = this.set("riskScore", null)
    
    @scala.inline
    def setSourceAddress(value: NullableOption[String]): Self = this.set("sourceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAddress: Self = this.set("sourceAddress", js.undefined)
    
    @scala.inline
    def setSourceAddressNull: Self = this.set("sourceAddress", null)
    
    @scala.inline
    def setSourceLocation(value: NullableOption[String]): Self = this.set("sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLocation: Self = this.set("sourceLocation", js.undefined)
    
    @scala.inline
    def setSourceLocationNull: Self = this.set("sourceLocation", null)
    
    @scala.inline
    def setSourcePort(value: NullableOption[String]): Self = this.set("sourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePort: Self = this.set("sourcePort", js.undefined)
    
    @scala.inline
    def setSourcePortNull: Self = this.set("sourcePort", null)
    
    @scala.inline
    def setStatus(value: NullableOption[ConnectionStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    
    @scala.inline
    def setUrlParameters(value: NullableOption[String]): Self = this.set("urlParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlParameters: Self = this.set("urlParameters", js.undefined)
    
    @scala.inline
    def setUrlParametersNull: Self = this.set("urlParameters", null)
  }
}
