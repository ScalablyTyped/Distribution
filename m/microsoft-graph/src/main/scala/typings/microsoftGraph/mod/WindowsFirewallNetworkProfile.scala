package typings.microsoftGraph.mod

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
  var authorizedApplicationRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures the firewall to merge connection security rules from group policy with those from local store instead of
    * ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and
    * ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes
    * priority.
    */
  var connectionSecurityRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.undefined
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
  var globalPortRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures the firewall to block all incoming connections by default. When InboundConnectionsRequired and
    * InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
    */
  var inboundConnectionsBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevents the firewall from displaying notifications when an application is blocked from listening on a port. When
    * InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
    */
  var inboundNotificationsBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures the firewall to block all incoming traffic regardless of other policy settings. When IncomingTrafficRequired
    * and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
    */
  var incomingTrafficBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures the firewall to block all outgoing connections by default. When OutboundConnectionsRequired and
    * OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to
    * Windows releases version 1809 and above.
    */
  var outboundConnectionsBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures the firewall to merge Firewall Rule policies from group policy with those from local store instead of
    * ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both
    * true, PolicyRulesFromGroupPolicyMerged takes priority.
    */
  var policyRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures the firewall to allow the host computer to respond to unsolicited network traffic of that traffic is secured
    * by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and
    * SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
    */
  var securedPacketExemptionAllowed: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent the server from operating in stealth mode. When StealthModeRequired and StealthModeBlocked are both true,
    * StealthModeBlocked takes priority.
    */
  var stealthModeBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures the firewall to block unicast responses to multicast broadcast traffic. When
    * UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true,
    * UnicastResponsesToMulticastBroadcastsBlocked takes priority.
    */
  var unicastResponsesToMulticastBroadcastsBlocked: js.UndefOr[Boolean] = js.undefined
}

object WindowsFirewallNetworkProfile {
  @scala.inline
  def apply(
    authorizedApplicationRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.undefined,
    connectionSecurityRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.undefined,
    firewallEnabled: StateManagementSetting = null,
    globalPortRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.undefined,
    inboundConnectionsBlocked: js.UndefOr[Boolean] = js.undefined,
    inboundNotificationsBlocked: js.UndefOr[Boolean] = js.undefined,
    incomingTrafficBlocked: js.UndefOr[Boolean] = js.undefined,
    outboundConnectionsBlocked: js.UndefOr[Boolean] = js.undefined,
    policyRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.undefined,
    securedPacketExemptionAllowed: js.UndefOr[Boolean] = js.undefined,
    stealthModeBlocked: js.UndefOr[Boolean] = js.undefined,
    unicastResponsesToMulticastBroadcastsBlocked: js.UndefOr[Boolean] = js.undefined
  ): WindowsFirewallNetworkProfile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(authorizedApplicationRulesFromGroupPolicyMerged)) __obj.updateDynamic("authorizedApplicationRulesFromGroupPolicyMerged")(authorizedApplicationRulesFromGroupPolicyMerged.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionSecurityRulesFromGroupPolicyMerged)) __obj.updateDynamic("connectionSecurityRulesFromGroupPolicyMerged")(connectionSecurityRulesFromGroupPolicyMerged.asInstanceOf[js.Any])
    if (firewallEnabled != null) __obj.updateDynamic("firewallEnabled")(firewallEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(globalPortRulesFromGroupPolicyMerged)) __obj.updateDynamic("globalPortRulesFromGroupPolicyMerged")(globalPortRulesFromGroupPolicyMerged.asInstanceOf[js.Any])
    if (!js.isUndefined(inboundConnectionsBlocked)) __obj.updateDynamic("inboundConnectionsBlocked")(inboundConnectionsBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(inboundNotificationsBlocked)) __obj.updateDynamic("inboundNotificationsBlocked")(inboundNotificationsBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(incomingTrafficBlocked)) __obj.updateDynamic("incomingTrafficBlocked")(incomingTrafficBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(outboundConnectionsBlocked)) __obj.updateDynamic("outboundConnectionsBlocked")(outboundConnectionsBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(policyRulesFromGroupPolicyMerged)) __obj.updateDynamic("policyRulesFromGroupPolicyMerged")(policyRulesFromGroupPolicyMerged.asInstanceOf[js.Any])
    if (!js.isUndefined(securedPacketExemptionAllowed)) __obj.updateDynamic("securedPacketExemptionAllowed")(securedPacketExemptionAllowed.asInstanceOf[js.Any])
    if (!js.isUndefined(stealthModeBlocked)) __obj.updateDynamic("stealthModeBlocked")(stealthModeBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(unicastResponsesToMulticastBroadcastsBlocked)) __obj.updateDynamic("unicastResponsesToMulticastBroadcastsBlocked")(unicastResponsesToMulticastBroadcastsBlocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsFirewallNetworkProfile]
  }
}

