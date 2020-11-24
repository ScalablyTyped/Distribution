package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerInfo extends js.Object {
  
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
  implicit class LoadBalancerInfoOps[Self <: LoadBalancerInfo] (val x: Self) extends AnyVal {
    
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
    def setBackendType(value: String): Self = this.set("backendType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendType: Self = this.set("backendType", js.undefined)
    
    @scala.inline
    def setBackendUri(value: String): Self = this.set("backendUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendUri: Self = this.set("backendUri", js.undefined)
    
    @scala.inline
    def setBackendsVarargs(value: LoadBalancerBackend*): Self = this.set("backends", js.Array(value :_*))
    
    @scala.inline
    def setBackends(value: js.Array[LoadBalancerBackend]): Self = this.set("backends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackends: Self = this.set("backends", js.undefined)
    
    @scala.inline
    def setHealthCheckUri(value: String): Self = this.set("healthCheckUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckUri: Self = this.set("healthCheckUri", js.undefined)
    
    @scala.inline
    def setLoadBalancerType(value: String): Self = this.set("loadBalancerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerType: Self = this.set("loadBalancerType", js.undefined)
  }
}
