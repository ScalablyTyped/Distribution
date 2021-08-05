package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerInfo extends StObject {
  
  /** Type of load balancer's backend configuration. */
  var backendType: js.UndefOr[String] = js.undefined
  
  /** Backend configuration URI. */
  var backendUri: js.UndefOr[String] = js.undefined
  
  /** Information for the loadbalancer backends. */
  var backends: js.UndefOr[js.Array[LoadBalancerBackend]] = js.undefined
  
  /** URI of the health check for the load balancer. */
  var healthCheckUri: js.UndefOr[String] = js.undefined
  
  /** Type of the load balancer. */
  var loadBalancerType: js.UndefOr[String] = js.undefined
}
object LoadBalancerInfo {
  
  inline def apply(): LoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerInfo]
  }
  
  extension [Self <: LoadBalancerInfo](x: Self) {
    
    inline def setBackendType(value: String): Self = StObject.set(x, "backendType", value.asInstanceOf[js.Any])
    
    inline def setBackendTypeUndefined: Self = StObject.set(x, "backendType", js.undefined)
    
    inline def setBackendUri(value: String): Self = StObject.set(x, "backendUri", value.asInstanceOf[js.Any])
    
    inline def setBackendUriUndefined: Self = StObject.set(x, "backendUri", js.undefined)
    
    inline def setBackends(value: js.Array[LoadBalancerBackend]): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
    
    inline def setBackendsUndefined: Self = StObject.set(x, "backends", js.undefined)
    
    inline def setBackendsVarargs(value: LoadBalancerBackend*): Self = StObject.set(x, "backends", js.Array(value :_*))
    
    inline def setHealthCheckUri(value: String): Self = StObject.set(x, "healthCheckUri", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUriUndefined: Self = StObject.set(x, "healthCheckUri", js.undefined)
    
    inline def setLoadBalancerType(value: String): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTypeUndefined: Self = StObject.set(x, "loadBalancerType", js.undefined)
  }
}
