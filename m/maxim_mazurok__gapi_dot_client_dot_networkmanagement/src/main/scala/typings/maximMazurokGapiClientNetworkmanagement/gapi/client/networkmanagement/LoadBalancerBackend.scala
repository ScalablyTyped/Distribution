package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerBackend extends js.Object {
  
  /** Name of a Compute Engine instance or network endpoint. */
  var displayName: js.UndefOr[String] = js.native
  
  /** A list of firewall rule URIs allowing probes from health check IP ranges. */
  var healthCheckAllowingFirewallRules: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of firewall rule URIs blocking probes from health check IP ranges. */
  var healthCheckBlockingFirewallRules: js.UndefOr[js.Array[String]] = js.native
  
  /** State of the health check firewall configuration. */
  var healthCheckFirewallState: js.UndefOr[String] = js.native
  
  /** URI of a Compute Engine instance or network endpoint. */
  var uri: js.UndefOr[String] = js.native
}
object LoadBalancerBackend {
  
  @scala.inline
  def apply(): LoadBalancerBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerBackend]
  }
  
  @scala.inline
  implicit class LoadBalancerBackendOps[Self <: LoadBalancerBackend] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setHealthCheckAllowingFirewallRulesVarargs(value: String*): Self = this.set("healthCheckAllowingFirewallRules", js.Array(value :_*))
    
    @scala.inline
    def setHealthCheckAllowingFirewallRules(value: js.Array[String]): Self = this.set("healthCheckAllowingFirewallRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckAllowingFirewallRules: Self = this.set("healthCheckAllowingFirewallRules", js.undefined)
    
    @scala.inline
    def setHealthCheckBlockingFirewallRulesVarargs(value: String*): Self = this.set("healthCheckBlockingFirewallRules", js.Array(value :_*))
    
    @scala.inline
    def setHealthCheckBlockingFirewallRules(value: js.Array[String]): Self = this.set("healthCheckBlockingFirewallRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckBlockingFirewallRules: Self = this.set("healthCheckBlockingFirewallRules", js.undefined)
    
    @scala.inline
    def setHealthCheckFirewallState(value: String): Self = this.set("healthCheckFirewallState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckFirewallState: Self = this.set("healthCheckFirewallState", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
