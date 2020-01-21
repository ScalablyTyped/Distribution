package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConnection extends js.Object {
  // Name of the application managing the network connection (for example, Facebook, SMTP, etc.).
  var applicationName: js.UndefOr[String] = js.undefined
  // Destination IP address (of the network connection).
  var destinationAddress: js.UndefOr[String] = js.undefined
  // Destination domain portion of the destination URL. (for example 'www.contoso.com').
  var destinationDomain: js.UndefOr[String] = js.undefined
  // Destination port (of the network connection).
  var destinationPort: js.UndefOr[String] = js.undefined
  // Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
  var destinationUrl: js.UndefOr[String] = js.undefined
  // Network connection direction. Possible values are: unknown, inbound, outbound.
  var direction: js.UndefOr[ConnectionDirection] = js.undefined
  /**
    * Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var domainRegisteredDateTime: js.UndefOr[String] = js.undefined
  /**
    * The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was
    * tampered with).
    */
  var localDnsName: js.UndefOr[String] = js.undefined
  // Network Address Translation destination IP address.
  var natDestinationAddress: js.UndefOr[String] = js.undefined
  // Network Address Translation destination port.
  var natDestinationPort: js.UndefOr[String] = js.undefined
  // Network Address Translation source IP address.
  var natSourceAddress: js.UndefOr[String] = js.undefined
  // Network Address Translation source port.
  var natSourcePort: js.UndefOr[String] = js.undefined
  /**
    * Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader,
    * ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader,
    * ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
    */
  var protocol: js.UndefOr[SecurityNetworkProtocol] = js.undefined
  /**
    * Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[String] = js.undefined
  // Source (i.e. origin) IP address (of the network connection).
  var sourceAddress: js.UndefOr[String] = js.undefined
  // Source (i.e. origin) IP port (of the network connection).
  var sourcePort: js.UndefOr[String] = js.undefined
  // Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
  var status: js.UndefOr[ConnectionStatus] = js.undefined
  // Parameters (suffix) of the destination URL.
  var urlParameters: js.UndefOr[String] = js.undefined
}

object NetworkConnection {
  @scala.inline
  def apply(
    applicationName: String = null,
    destinationAddress: String = null,
    destinationDomain: String = null,
    destinationPort: String = null,
    destinationUrl: String = null,
    direction: ConnectionDirection = null,
    domainRegisteredDateTime: String = null,
    localDnsName: String = null,
    natDestinationAddress: String = null,
    natDestinationPort: String = null,
    natSourceAddress: String = null,
    natSourcePort: String = null,
    protocol: SecurityNetworkProtocol = null,
    riskScore: String = null,
    sourceAddress: String = null,
    sourcePort: String = null,
    status: ConnectionStatus = null,
    urlParameters: String = null
  ): NetworkConnection = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (destinationAddress != null) __obj.updateDynamic("destinationAddress")(destinationAddress.asInstanceOf[js.Any])
    if (destinationDomain != null) __obj.updateDynamic("destinationDomain")(destinationDomain.asInstanceOf[js.Any])
    if (destinationPort != null) __obj.updateDynamic("destinationPort")(destinationPort.asInstanceOf[js.Any])
    if (destinationUrl != null) __obj.updateDynamic("destinationUrl")(destinationUrl.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (domainRegisteredDateTime != null) __obj.updateDynamic("domainRegisteredDateTime")(domainRegisteredDateTime.asInstanceOf[js.Any])
    if (localDnsName != null) __obj.updateDynamic("localDnsName")(localDnsName.asInstanceOf[js.Any])
    if (natDestinationAddress != null) __obj.updateDynamic("natDestinationAddress")(natDestinationAddress.asInstanceOf[js.Any])
    if (natDestinationPort != null) __obj.updateDynamic("natDestinationPort")(natDestinationPort.asInstanceOf[js.Any])
    if (natSourceAddress != null) __obj.updateDynamic("natSourceAddress")(natSourceAddress.asInstanceOf[js.Any])
    if (natSourcePort != null) __obj.updateDynamic("natSourcePort")(natSourcePort.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (riskScore != null) __obj.updateDynamic("riskScore")(riskScore.asInstanceOf[js.Any])
    if (sourceAddress != null) __obj.updateDynamic("sourceAddress")(sourceAddress.asInstanceOf[js.Any])
    if (sourcePort != null) __obj.updateDynamic("sourcePort")(sourcePort.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (urlParameters != null) __obj.updateDynamic("urlParameters")(urlParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConnection]
  }
}

