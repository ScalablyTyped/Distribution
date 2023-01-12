package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  /** Display information of the final state "abort" and reason. */
  var abort: js.UndefOr[AbortInfo] = js.undefined
  
  /** This is a step that leads to the final state Drop. */
  var causesDrop: js.UndefOr[Boolean] = js.undefined
  
  /** Display information of a Cloud SQL instance. */
  var cloudSqlInstance: js.UndefOr[CloudSQLInstanceInfo] = js.undefined
  
  /** Display information of the final state "deliver" and reason. */
  var deliver: js.UndefOr[DeliverInfo] = js.undefined
  
  /** A description of the step. Usually this is a summary of the state. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Display information of the final state "drop" and reason. */
  var drop: js.UndefOr[DropInfo] = js.undefined
  
  /**
    * Display information of the source and destination under analysis. The endpoint information in an intermediate state may differ with the initial input, as it might be modified by
    * state like NAT, or Connection Proxy.
    */
  var endpoint: js.UndefOr[EndpointInfo] = js.undefined
  
  /** Display information of a Compute Engine firewall rule. */
  var firewall: js.UndefOr[FirewallInfo] = js.undefined
  
  /** Display information of the final state "forward" and reason. */
  var forward: js.UndefOr[ForwardInfo] = js.undefined
  
  /** Display information of a Compute Engine forwarding rule. */
  var forwardingRule: js.UndefOr[ForwardingRuleInfo] = js.undefined
  
  /** Display information of a Google Kubernetes Engine cluster master. */
  var gkeMaster: js.UndefOr[GKEMasterInfo] = js.undefined
  
  /** Display information of a Compute Engine instance. */
  var instance: js.UndefOr[InstanceInfo] = js.undefined
  
  /** Display information of the load balancers. */
  var loadBalancer: js.UndefOr[LoadBalancerInfo] = js.undefined
  
  /** Display information of a Google Cloud network. */
  var network: js.UndefOr[NetworkInfo] = js.undefined
  
  /** Project ID that contains the configuration this step is validating. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Display information of a Compute Engine route. */
  var route: js.UndefOr[RouteInfo] = js.undefined
  
  /** Each step is in one of the pre-defined states. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Display information of a Compute Engine VPN gateway. */
  var vpnGateway: js.UndefOr[VpnGatewayInfo] = js.undefined
  
  /** Display information of a Compute Engine VPN tunnel. */
  var vpnTunnel: js.UndefOr[VpnTunnelInfo] = js.undefined
}
object Step {
  
  inline def apply(): Step = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: AbortInfo): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setCausesDrop(value: Boolean): Self = StObject.set(x, "causesDrop", value.asInstanceOf[js.Any])
    
    inline def setCausesDropUndefined: Self = StObject.set(x, "causesDrop", js.undefined)
    
    inline def setCloudSqlInstance(value: CloudSQLInstanceInfo): Self = StObject.set(x, "cloudSqlInstance", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlInstanceUndefined: Self = StObject.set(x, "cloudSqlInstance", js.undefined)
    
    inline def setDeliver(value: DeliverInfo): Self = StObject.set(x, "deliver", value.asInstanceOf[js.Any])
    
    inline def setDeliverUndefined: Self = StObject.set(x, "deliver", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDrop(value: DropInfo): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setEndpoint(value: EndpointInfo): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setFirewall(value: FirewallInfo): Self = StObject.set(x, "firewall", value.asInstanceOf[js.Any])
    
    inline def setFirewallUndefined: Self = StObject.set(x, "firewall", js.undefined)
    
    inline def setForward(value: ForwardInfo): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    inline def setForwardingRule(value: ForwardingRuleInfo): Self = StObject.set(x, "forwardingRule", value.asInstanceOf[js.Any])
    
    inline def setForwardingRuleUndefined: Self = StObject.set(x, "forwardingRule", js.undefined)
    
    inline def setGkeMaster(value: GKEMasterInfo): Self = StObject.set(x, "gkeMaster", value.asInstanceOf[js.Any])
    
    inline def setGkeMasterUndefined: Self = StObject.set(x, "gkeMaster", js.undefined)
    
    inline def setInstance(value: InstanceInfo): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setLoadBalancer(value: LoadBalancerInfo): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
    
    inline def setNetwork(value: NetworkInfo): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRoute(value: RouteInfo): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVpnGateway(value: VpnGatewayInfo): Self = StObject.set(x, "vpnGateway", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayUndefined: Self = StObject.set(x, "vpnGateway", js.undefined)
    
    inline def setVpnTunnel(value: VpnTunnelInfo): Self = StObject.set(x, "vpnTunnel", value.asInstanceOf[js.Any])
    
    inline def setVpnTunnelUndefined: Self = StObject.set(x, "vpnTunnel", js.undefined)
  }
}
