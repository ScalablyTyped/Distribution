package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConnection extends js.Object {
  // Name of the application managing the network connection (for example, Facebook or SMTP).
  var applicationName: js.UndefOr[String] = js.native
  // Destination IP address (of the network connection).
  var destinationAddress: js.UndefOr[String] = js.native
  // Destination domain portion of the destination URL. (for example 'www.contoso.com').
  var destinationDomain: js.UndefOr[String] = js.native
  // Location (by IP address mapping) associated with the destination of a network connection.
  var destinationLocation: js.UndefOr[String] = js.native
  // Destination port (of the network connection).
  var destinationPort: js.UndefOr[String] = js.native
  // Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
  var destinationUrl: js.UndefOr[String] = js.native
  // Network connection direction. Possible values are: unknown, inbound, outbound.
  var direction: js.UndefOr[ConnectionDirection] = js.native
  /**
    * Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var domainRegisteredDateTime: js.UndefOr[String] = js.native
  /**
    * The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was
    * tampered with).
    */
  var localDnsName: js.UndefOr[String] = js.native
  // Network Address Translation destination IP address.
  var natDestinationAddress: js.UndefOr[String] = js.native
  // Network Address Translation destination port.
  var natDestinationPort: js.UndefOr[String] = js.native
  // Network Address Translation source IP address.
  var natSourceAddress: js.UndefOr[String] = js.native
  // Network Address Translation source port.
  var natSourcePort: js.UndefOr[String] = js.native
  /**
    * Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader,
    * ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader,
    * ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
    */
  var protocol: js.UndefOr[SecurityNetworkProtocol] = js.native
  /**
    * Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[String] = js.native
  // Source (i.e. origin) IP address (of the network connection).
  var sourceAddress: js.UndefOr[String] = js.native
  // Location (by IP address mapping) associated with the source of a network connection.
  var sourceLocation: js.UndefOr[String] = js.native
  // Source (i.e. origin) IP port (of the network connection).
  var sourcePort: js.UndefOr[String] = js.native
  // Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
  var status: js.UndefOr[ConnectionStatus] = js.native
  // Parameters (suffix) of the destination URL.
  var urlParameters: js.UndefOr[String] = js.native
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
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    @scala.inline
    def setDestinationAddress(value: String): Self = this.set("destinationAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationAddress: Self = this.set("destinationAddress", js.undefined)
    @scala.inline
    def setDestinationDomain(value: String): Self = this.set("destinationDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationDomain: Self = this.set("destinationDomain", js.undefined)
    @scala.inline
    def setDestinationLocation(value: String): Self = this.set("destinationLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationLocation: Self = this.set("destinationLocation", js.undefined)
    @scala.inline
    def setDestinationPort(value: String): Self = this.set("destinationPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationPort: Self = this.set("destinationPort", js.undefined)
    @scala.inline
    def setDestinationUrl(value: String): Self = this.set("destinationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationUrl: Self = this.set("destinationUrl", js.undefined)
    @scala.inline
    def setDirection(value: ConnectionDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDomainRegisteredDateTime(value: String): Self = this.set("domainRegisteredDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainRegisteredDateTime: Self = this.set("domainRegisteredDateTime", js.undefined)
    @scala.inline
    def setLocalDnsName(value: String): Self = this.set("localDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalDnsName: Self = this.set("localDnsName", js.undefined)
    @scala.inline
    def setNatDestinationAddress(value: String): Self = this.set("natDestinationAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatDestinationAddress: Self = this.set("natDestinationAddress", js.undefined)
    @scala.inline
    def setNatDestinationPort(value: String): Self = this.set("natDestinationPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatDestinationPort: Self = this.set("natDestinationPort", js.undefined)
    @scala.inline
    def setNatSourceAddress(value: String): Self = this.set("natSourceAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatSourceAddress: Self = this.set("natSourceAddress", js.undefined)
    @scala.inline
    def setNatSourcePort(value: String): Self = this.set("natSourcePort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatSourcePort: Self = this.set("natSourcePort", js.undefined)
    @scala.inline
    def setProtocol(value: SecurityNetworkProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRiskScore(value: String): Self = this.set("riskScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRiskScore: Self = this.set("riskScore", js.undefined)
    @scala.inline
    def setSourceAddress(value: String): Self = this.set("sourceAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAddress: Self = this.set("sourceAddress", js.undefined)
    @scala.inline
    def setSourceLocation(value: String): Self = this.set("sourceLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceLocation: Self = this.set("sourceLocation", js.undefined)
    @scala.inline
    def setSourcePort(value: String): Self = this.set("sourcePort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePort: Self = this.set("sourcePort", js.undefined)
    @scala.inline
    def setStatus(value: ConnectionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUrlParameters(value: String): Self = this.set("urlParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlParameters: Self = this.set("urlParameters", js.undefined)
  }
  
}

