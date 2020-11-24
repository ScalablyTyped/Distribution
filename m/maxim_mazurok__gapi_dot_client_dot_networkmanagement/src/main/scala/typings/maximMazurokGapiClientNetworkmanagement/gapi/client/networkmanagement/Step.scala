package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step extends js.Object {
  
  /** Display info of the final state "abort" and reason. */
  var abort: js.UndefOr[AbortInfo] = js.native
  
  /** This is a step that leads to the final state Drop. */
  var causesDrop: js.UndefOr[Boolean] = js.native
  
  /** Display info of the final state "deliver" and reason. */
  var deliver: js.UndefOr[DeliverInfo] = js.native
  
  /** A description of the step. Usually this is a summary of the state. */
  var description: js.UndefOr[String] = js.native
  
  /** Display info of the final state "drop" and reason. */
  var drop: js.UndefOr[DropInfo] = js.native
  
  /**
    * Display info of the source and destination under analysis. The endpiont info in an intermediate state may differ with the initial input, as it might be modified by state like NAT,
    * or Connection Proxy.
    */
  var endpoint: js.UndefOr[EndpointInfo] = js.native
  
  /** Display info of a Compute Engine firewall rule. */
  var firewall: js.UndefOr[FirewallInfo] = js.native
  
  /** Display info of the final state "forward" and reason. */
  var forward: js.UndefOr[ForwardInfo] = js.native
  
  /** Display info of a Compute Engine forwarding rule. */
  var forwardingRule: js.UndefOr[ForwardingRuleInfo] = js.native
  
  /** Display info of a Compute Engine instance. */
  var instance: js.UndefOr[InstanceInfo] = js.native
  
  /** Display info of the load balancers. */
  var loadBalancer: js.UndefOr[LoadBalancerInfo] = js.native
  
  /** Display info of a GCP network. */
  var network: js.UndefOr[NetworkInfo] = js.native
  
  /** Project ID that contains the configuration this step is validating. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Display info of a Compute Engine route. */
  var route: js.UndefOr[RouteInfo] = js.native
  
  /** Each step is in one of the pre-defined states. */
  var state: js.UndefOr[String] = js.native
  
  /** Display info of a Compute Engine VPN gateway. */
  var vpnGateway: js.UndefOr[VpnGatewayInfo] = js.native
  
  /** Display info of a Compute Engine VPN tunnel. */
  var vpnTunnel: js.UndefOr[VpnTunnelInfo] = js.native
}
object Step {
  
  @scala.inline
  def apply(): Step = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: AbortInfo): Self = this.set("abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    
    @scala.inline
    def setCausesDrop(value: Boolean): Self = this.set("causesDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCausesDrop: Self = this.set("causesDrop", js.undefined)
    
    @scala.inline
    def setDeliver(value: DeliverInfo): Self = this.set("deliver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliver: Self = this.set("deliver", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDrop(value: DropInfo): Self = this.set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setEndpoint(value: EndpointInfo): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setFirewall(value: FirewallInfo): Self = this.set("firewall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewall: Self = this.set("firewall", js.undefined)
    
    @scala.inline
    def setForward(value: ForwardInfo): Self = this.set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    
    @scala.inline
    def setForwardingRule(value: ForwardingRuleInfo): Self = this.set("forwardingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingRule: Self = this.set("forwardingRule", js.undefined)
    
    @scala.inline
    def setInstance(value: InstanceInfo): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setLoadBalancer(value: LoadBalancerInfo): Self = this.set("loadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancer: Self = this.set("loadBalancer", js.undefined)
    
    @scala.inline
    def setNetwork(value: NetworkInfo): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setRoute(value: RouteInfo): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setVpnGateway(value: VpnGatewayInfo): Self = this.set("vpnGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnGateway: Self = this.set("vpnGateway", js.undefined)
    
    @scala.inline
    def setVpnTunnel(value: VpnTunnelInfo): Self = this.set("vpnTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnTunnel: Self = this.set("vpnTunnel", js.undefined)
  }
}
