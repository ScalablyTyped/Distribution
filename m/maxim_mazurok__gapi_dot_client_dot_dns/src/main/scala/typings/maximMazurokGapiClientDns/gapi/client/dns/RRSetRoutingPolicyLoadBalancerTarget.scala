package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RRSetRoutingPolicyLoadBalancerTarget extends StObject {
  
  /** The frontend IP address of the */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  var ipProtocol: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var loadBalancerType: js.UndefOr[String] = js.undefined
  
  /** The fully qualified url of the network on which the ILB is */
  var networkUrl: js.UndefOr[String] = js.undefined
  
  /** Load Balancer to health check. The configured port of the Load Balancer. */
  var port: js.UndefOr[String] = js.undefined
  
  /** present. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network} The project ID in which the ILB exists. */
  var project: js.UndefOr[String] = js.undefined
  
  /** The region for regional ILBs. */
  var region: js.UndefOr[String] = js.undefined
}
object RRSetRoutingPolicyLoadBalancerTarget {
  
  inline def apply(): RRSetRoutingPolicyLoadBalancerTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyLoadBalancerTarget]
  }
  
  extension [Self <: RRSetRoutingPolicyLoadBalancerTarget](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setIpProtocol(value: String): Self = StObject.set(x, "ipProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "ipProtocol", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLoadBalancerType(value: String): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTypeUndefined: Self = StObject.set(x, "loadBalancerType", js.undefined)
    
    inline def setNetworkUrl(value: String): Self = StObject.set(x, "networkUrl", value.asInstanceOf[js.Any])
    
    inline def setNetworkUrlUndefined: Self = StObject.set(x, "networkUrl", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
