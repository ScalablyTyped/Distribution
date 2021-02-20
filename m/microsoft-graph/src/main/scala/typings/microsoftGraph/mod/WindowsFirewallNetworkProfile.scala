package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsFirewallNetworkProfile extends StObject {
  
  /**
    * Configures the firewall to merge authorized application rules from group policy with those from local store instead of
    * ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and
    * AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes
    * priority.
    */
  var authorizedApplicationRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures the firewall to merge connection security rules from group policy with those from local store instead of
    * ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and
    * ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes
    * priority.
    */
  var connectionSecurityRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures the host device to allow or block the firewall and advanced security enforcement for the network profile.
    * Possible values are: notConfigured, blocked, allowed.
    */
  var firewallEnabled: js.UndefOr[StateManagementSetting] = js.native
  
  /**
    * Configures the firewall to merge global port rules from group policy with those from local store instead of ignoring
    * the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both
    * true, GlobalPortRulesFromGroupPolicyMerged takes priority.
    */
  var globalPortRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures the firewall to block all incoming connections by default. When InboundConnectionsRequired and
    * InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
    */
  var inboundConnectionsBlocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevents the firewall from displaying notifications when an application is blocked from listening on a port. When
    * InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
    */
  var inboundNotificationsBlocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures the firewall to block all incoming traffic regardless of other policy settings. When IncomingTrafficRequired
    * and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
    */
  var incomingTrafficBlocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures the firewall to block all outgoing connections by default. When OutboundConnectionsRequired and
    * OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to
    * Windows releases version 1809 and above.
    */
  var outboundConnectionsBlocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures the firewall to merge Firewall Rule policies from group policy with those from local store instead of
    * ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both
    * true, PolicyRulesFromGroupPolicyMerged takes priority.
    */
  var policyRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures the firewall to allow the host computer to respond to unsolicited network traffic of that traffic is secured
    * by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and
    * SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
    */
  var securedPacketExemptionAllowed: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent the server from operating in stealth mode. When StealthModeRequired and StealthModeBlocked are both true,
    * StealthModeBlocked takes priority.
    */
  var stealthModeBlocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Configures the firewall to block unicast responses to multicast broadcast traffic. When
    * UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true,
    * UnicastResponsesToMulticastBroadcastsBlocked takes priority.
    */
  var unicastResponsesToMulticastBroadcastsBlocked: js.UndefOr[Boolean] = js.native
}
object WindowsFirewallNetworkProfile {
  
  @scala.inline
  def apply(): WindowsFirewallNetworkProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsFirewallNetworkProfile]
  }
  
  @scala.inline
  implicit class WindowsFirewallNetworkProfileMutableBuilder[Self <: WindowsFirewallNetworkProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizedApplicationRulesFromGroupPolicyMerged(value: Boolean): Self = StObject.set(x, "authorizedApplicationRulesFromGroupPolicyMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedApplicationRulesFromGroupPolicyMergedUndefined: Self = StObject.set(x, "authorizedApplicationRulesFromGroupPolicyMerged", js.undefined)
    
    @scala.inline
    def setConnectionSecurityRulesFromGroupPolicyMerged(value: Boolean): Self = StObject.set(x, "connectionSecurityRulesFromGroupPolicyMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionSecurityRulesFromGroupPolicyMergedUndefined: Self = StObject.set(x, "connectionSecurityRulesFromGroupPolicyMerged", js.undefined)
    
    @scala.inline
    def setFirewallEnabled(value: StateManagementSetting): Self = StObject.set(x, "firewallEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallEnabledUndefined: Self = StObject.set(x, "firewallEnabled", js.undefined)
    
    @scala.inline
    def setGlobalPortRulesFromGroupPolicyMerged(value: Boolean): Self = StObject.set(x, "globalPortRulesFromGroupPolicyMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalPortRulesFromGroupPolicyMergedUndefined: Self = StObject.set(x, "globalPortRulesFromGroupPolicyMerged", js.undefined)
    
    @scala.inline
    def setInboundConnectionsBlocked(value: Boolean): Self = StObject.set(x, "inboundConnectionsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundConnectionsBlockedUndefined: Self = StObject.set(x, "inboundConnectionsBlocked", js.undefined)
    
    @scala.inline
    def setInboundNotificationsBlocked(value: Boolean): Self = StObject.set(x, "inboundNotificationsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundNotificationsBlockedUndefined: Self = StObject.set(x, "inboundNotificationsBlocked", js.undefined)
    
    @scala.inline
    def setIncomingTrafficBlocked(value: Boolean): Self = StObject.set(x, "incomingTrafficBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingTrafficBlockedUndefined: Self = StObject.set(x, "incomingTrafficBlocked", js.undefined)
    
    @scala.inline
    def setOutboundConnectionsBlocked(value: Boolean): Self = StObject.set(x, "outboundConnectionsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundConnectionsBlockedUndefined: Self = StObject.set(x, "outboundConnectionsBlocked", js.undefined)
    
    @scala.inline
    def setPolicyRulesFromGroupPolicyMerged(value: Boolean): Self = StObject.set(x, "policyRulesFromGroupPolicyMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyRulesFromGroupPolicyMergedUndefined: Self = StObject.set(x, "policyRulesFromGroupPolicyMerged", js.undefined)
    
    @scala.inline
    def setSecuredPacketExemptionAllowed(value: Boolean): Self = StObject.set(x, "securedPacketExemptionAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecuredPacketExemptionAllowedUndefined: Self = StObject.set(x, "securedPacketExemptionAllowed", js.undefined)
    
    @scala.inline
    def setStealthModeBlocked(value: Boolean): Self = StObject.set(x, "stealthModeBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStealthModeBlockedUndefined: Self = StObject.set(x, "stealthModeBlocked", js.undefined)
    
    @scala.inline
    def setUnicastResponsesToMulticastBroadcastsBlocked(value: Boolean): Self = StObject.set(x, "unicastResponsesToMulticastBroadcastsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicastResponsesToMulticastBroadcastsBlockedUndefined: Self = StObject.set(x, "unicastResponsesToMulticastBroadcastsBlocked", js.undefined)
  }
}
