package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConnection extends js.Object {
  // Name of the application managing the network connection (for example, Facebook, SMTP, etc.).
  var applicationName: js.UndefOr[java.lang.String] = js.undefined
  // Destination IP address (of the network connection).
  var destinationAddress: js.UndefOr[java.lang.String] = js.undefined
  // Destination domain portion of the destination URL. (for example 'www.contoso.com').
  var destinationDomain: js.UndefOr[java.lang.String] = js.undefined
  // Destination port (of the network connection).
  var destinationPort: js.UndefOr[java.lang.String] = js.undefined
  // Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
  var destinationUrl: js.UndefOr[java.lang.String] = js.undefined
  // Network connection direction. Possible values are: unknown, inbound, outbound.
  var direction: js.UndefOr[ConnectionDirection] = js.undefined
  /**
    * Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var domainRegisteredDateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was
    * tampered with).
    */
  var localDnsName: js.UndefOr[java.lang.String] = js.undefined
  // Network Address Translation destination IP address.
  var natDestinationAddress: js.UndefOr[java.lang.String] = js.undefined
  // Network Address Translation destination port.
  var natDestinationPort: js.UndefOr[java.lang.String] = js.undefined
  // Network Address Translation source IP address.
  var natSourceAddress: js.UndefOr[java.lang.String] = js.undefined
  // Network Address Translation source port.
  var natSourcePort: js.UndefOr[java.lang.String] = js.undefined
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
  var riskScore: js.UndefOr[java.lang.String] = js.undefined
  // Source (i.e. origin) IP address (of the network connection).
  var sourceAddress: js.UndefOr[java.lang.String] = js.undefined
  // Source (i.e. origin) IP port (of the network connection).
  var sourcePort: js.UndefOr[java.lang.String] = js.undefined
  // Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
  var status: js.UndefOr[ConnectionStatus] = js.undefined
  // Parameters (suffix) of the destination URL.
  var urlParameters: js.UndefOr[java.lang.String] = js.undefined
}

object NetworkConnection {
  @scala.inline
  def apply(
    applicationName: java.lang.String = null,
    destinationAddress: java.lang.String = null,
    destinationDomain: java.lang.String = null,
    destinationPort: java.lang.String = null,
    destinationUrl: java.lang.String = null,
    direction: ConnectionDirection = null,
    domainRegisteredDateTime: java.lang.String = null,
    localDnsName: java.lang.String = null,
    natDestinationAddress: java.lang.String = null,
    natDestinationPort: java.lang.String = null,
    natSourceAddress: java.lang.String = null,
    natSourcePort: java.lang.String = null,
    protocol: SecurityNetworkProtocol = null,
    riskScore: java.lang.String = null,
    sourceAddress: java.lang.String = null,
    sourcePort: java.lang.String = null,
    status: ConnectionStatus = null,
    urlParameters: java.lang.String = null
  ): NetworkConnection = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (destinationAddress != null) __obj.updateDynamic("destinationAddress")(destinationAddress)
    if (destinationDomain != null) __obj.updateDynamic("destinationDomain")(destinationDomain)
    if (destinationPort != null) __obj.updateDynamic("destinationPort")(destinationPort)
    if (destinationUrl != null) __obj.updateDynamic("destinationUrl")(destinationUrl)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (domainRegisteredDateTime != null) __obj.updateDynamic("domainRegisteredDateTime")(domainRegisteredDateTime)
    if (localDnsName != null) __obj.updateDynamic("localDnsName")(localDnsName)
    if (natDestinationAddress != null) __obj.updateDynamic("natDestinationAddress")(natDestinationAddress)
    if (natDestinationPort != null) __obj.updateDynamic("natDestinationPort")(natDestinationPort)
    if (natSourceAddress != null) __obj.updateDynamic("natSourceAddress")(natSourceAddress)
    if (natSourcePort != null) __obj.updateDynamic("natSourcePort")(natSourcePort)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (riskScore != null) __obj.updateDynamic("riskScore")(riskScore)
    if (sourceAddress != null) __obj.updateDynamic("sourceAddress")(sourceAddress)
    if (sourcePort != null) __obj.updateDynamic("sourcePort")(sourcePort)
    if (status != null) __obj.updateDynamic("status")(status)
    if (urlParameters != null) __obj.updateDynamic("urlParameters")(urlParameters)
    __obj.asInstanceOf[NetworkConnection]
  }
}

