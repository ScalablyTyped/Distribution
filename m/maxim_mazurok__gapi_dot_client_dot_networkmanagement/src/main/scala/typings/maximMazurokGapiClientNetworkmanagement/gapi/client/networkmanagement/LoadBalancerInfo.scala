package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerInfo extends StObject {
  
  /** Type of load balancer's backend configuration. */
  var backendType: js.UndefOr[String] = js.native
  
  /** Backend configuration URI. */
  var backendUri: js.UndefOr[String] = js.native
  
  /** Information for the loadbalancer backends. */
  var backends: js.UndefOr[js.Array[LoadBalancerBackend]] = js.native
  
  /** URI of the health check for the load balancer. */
  var healthCheckUri: js.UndefOr[String] = js.native
  
  /** Type of the load balancer. */
  var loadBalancerType: js.UndefOr[String] = js.native
}
object LoadBalancerInfo {
  
  @scala.inline
  def apply(): LoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerInfo]
  }
  
  @scala.inline
  implicit class LoadBalancerInfoMutableBuilder[Self <: LoadBalancerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendType(value: String): Self = StObject.set(x, "backendType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendTypeUndefined: Self = StObject.set(x, "backendType", js.undefined)
    
    @scala.inline
    def setBackendUri(value: String): Self = StObject.set(x, "backendUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendUriUndefined: Self = StObject.set(x, "backendUri", js.undefined)
    
    @scala.inline
    def setBackends(value: js.Array[LoadBalancerBackend]): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendsUndefined: Self = StObject.set(x, "backends", js.undefined)
    
    @scala.inline
    def setBackendsVarargs(value: LoadBalancerBackend*): Self = StObject.set(x, "backends", js.Array(value :_*))
    
    @scala.inline
    def setHealthCheckUri(value: String): Self = StObject.set(x, "healthCheckUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUriUndefined: Self = StObject.set(x, "healthCheckUri", js.undefined)
    
    @scala.inline
    def setLoadBalancerType(value: String): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerTypeUndefined: Self = StObject.set(x, "loadBalancerType", js.undefined)
  }
}
