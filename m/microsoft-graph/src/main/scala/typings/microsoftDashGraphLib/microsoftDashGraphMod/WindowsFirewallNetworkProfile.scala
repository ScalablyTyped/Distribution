package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsFirewallNetworkProfile extends js.Object {
  /**
    * Configures the firewall to merge authorized application rules from group policy with those from local store instead of
    * ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and
    * AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes
    * priority.
    */
  var authorizedApplicationRulesFromGroupPolicyMerged: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configures the firewall to merge connection security rules from group policy with those from local store instead of
    * ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and
    * ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes
    * priority.
    */
  var connectionSecurityRulesFromGroupPolicyMerged: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configures the host device to allow or block the firewall and advanced security enforcement for the network profile.
    * Possible values are: notConfigured, blocked, allowed.
    */
  var firewallEnabled: js.UndefOr[StateManagementSetting] = js.undefined
  /**
    * Configures the firewall to merge global port rules from group policy with those from local store instead of ignoring
    * the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both
    * true, GlobalPortRulesFromGroupPolicyMerged takes priority.
    */
  var globalPortRulesFromGroupPolicyMerged: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configures the firewall to block all incoming connections by default. When InboundConnectionsRequired and
    * InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
    */
  var inboundConnectionsBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevents the firewall from displaying notifications when an application is blocked from listening on a port. When
    * InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
    */
  var inboundNotificationsBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configures the firewall to block all incoming traffic regardless of other policy settings. When IncomingTrafficRequired
    * and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
    */
  var incomingTrafficBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configures the firewall to block all outgoing connections by default. When OutboundConnectionsRequired and
    * OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to
    * Windows releases version 1809 and above.
    */
  var outboundConnectionsBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configures the firewall to merge Firewall Rule policies from group policy with those from local store instead of
    * ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both
    * true, PolicyRulesFromGroupPolicyMerged takes priority.
    */
  var policyRulesFromGroupPolicyMerged: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configures the firewall to allow the host computer to respond to unsolicited network traffic of that traffic is secured
    * by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and
    * SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
    */
  var securedPacketExemptionAllowed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevent the server from operating in stealth mode. When StealthModeRequired and StealthModeBlocked are both true,
    * StealthModeBlocked takes priority.
    */
  var stealthModeBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configures the firewall to block unicast responses to multicast broadcast traffic. When
    * UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true,
    * UnicastResponsesToMulticastBroadcastsBlocked takes priority.
    */
  var unicastResponsesToMulticastBroadcastsBlocked: js.UndefOr[scala.Boolean] = js.undefined
}

object WindowsFirewallNetworkProfile {
  @scala.inline
  def apply(
    authorizedApplicationRulesFromGroupPolicyMerged: js.UndefOr[scala.Boolean] = js.undefined,
    connectionSecurityRulesFromGroupPolicyMerged: js.UndefOr[scala.Boolean] = js.undefined,
    firewallEnabled: StateManagementSetting = null,
    globalPortRulesFromGroupPolicyMerged: js.UndefOr[scala.Boolean] = js.undefined,
    inboundConnectionsBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    inboundNotificationsBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    incomingTrafficBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    outboundConnectionsBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    policyRulesFromGroupPolicyMerged: js.UndefOr[scala.Boolean] = js.undefined,
    securedPacketExemptionAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    stealthModeBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    unicastResponsesToMulticastBroadcastsBlocked: js.UndefOr[scala.Boolean] = js.undefined
  ): WindowsFirewallNetworkProfile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(authorizedApplicationRulesFromGroupPolicyMerged)) __obj.updateDynamic("authorizedApplicationRulesFromGroupPolicyMerged")(authorizedApplicationRulesFromGroupPolicyMerged)
    if (!js.isUndefined(connectionSecurityRulesFromGroupPolicyMerged)) __obj.updateDynamic("connectionSecurityRulesFromGroupPolicyMerged")(connectionSecurityRulesFromGroupPolicyMerged)
    if (firewallEnabled != null) __obj.updateDynamic("firewallEnabled")(firewallEnabled)
    if (!js.isUndefined(globalPortRulesFromGroupPolicyMerged)) __obj.updateDynamic("globalPortRulesFromGroupPolicyMerged")(globalPortRulesFromGroupPolicyMerged)
    if (!js.isUndefined(inboundConnectionsBlocked)) __obj.updateDynamic("inboundConnectionsBlocked")(inboundConnectionsBlocked)
    if (!js.isUndefined(inboundNotificationsBlocked)) __obj.updateDynamic("inboundNotificationsBlocked")(inboundNotificationsBlocked)
    if (!js.isUndefined(incomingTrafficBlocked)) __obj.updateDynamic("incomingTrafficBlocked")(incomingTrafficBlocked)
    if (!js.isUndefined(outboundConnectionsBlocked)) __obj.updateDynamic("outboundConnectionsBlocked")(outboundConnectionsBlocked)
    if (!js.isUndefined(policyRulesFromGroupPolicyMerged)) __obj.updateDynamic("policyRulesFromGroupPolicyMerged")(policyRulesFromGroupPolicyMerged)
    if (!js.isUndefined(securedPacketExemptionAllowed)) __obj.updateDynamic("securedPacketExemptionAllowed")(securedPacketExemptionAllowed)
    if (!js.isUndefined(stealthModeBlocked)) __obj.updateDynamic("stealthModeBlocked")(stealthModeBlocked)
    if (!js.isUndefined(unicastResponsesToMulticastBroadcastsBlocked)) __obj.updateDynamic("unicastResponsesToMulticastBroadcastsBlocked")(unicastResponsesToMulticastBroadcastsBlocked)
    __obj.asInstanceOf[WindowsFirewallNetworkProfile]
  }
}

