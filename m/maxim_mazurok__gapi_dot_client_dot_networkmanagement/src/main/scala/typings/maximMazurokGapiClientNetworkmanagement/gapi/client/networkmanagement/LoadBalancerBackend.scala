package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerBackend extends StObject {
  
  /** Name of a Compute Engine instance or network endpoint. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** A list of firewall rule URIs allowing probes from health check IP ranges. */
  var healthCheckAllowingFirewallRules: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of firewall rule URIs blocking probes from health check IP ranges. */
  var healthCheckBlockingFirewallRules: js.UndefOr[js.Array[String]] = js.undefined
  
  /** State of the health check firewall configuration. */
  var healthCheckFirewallState: js.UndefOr[String] = js.undefined
  
  /** URI of a Compute Engine instance or network endpoint. */
  var uri: js.UndefOr[String] = js.undefined
}
object LoadBalancerBackend {
  
  inline def apply(): LoadBalancerBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerBackend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadBalancerBackend] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHealthCheckAllowingFirewallRules(value: js.Array[String]): Self = StObject.set(x, "healthCheckAllowingFirewallRules", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckAllowingFirewallRulesUndefined: Self = StObject.set(x, "healthCheckAllowingFirewallRules", js.undefined)
    
    inline def setHealthCheckAllowingFirewallRulesVarargs(value: String*): Self = StObject.set(x, "healthCheckAllowingFirewallRules", js.Array(value*))
    
    inline def setHealthCheckBlockingFirewallRules(value: js.Array[String]): Self = StObject.set(x, "healthCheckBlockingFirewallRules", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckBlockingFirewallRulesUndefined: Self = StObject.set(x, "healthCheckBlockingFirewallRules", js.undefined)
    
    inline def setHealthCheckBlockingFirewallRulesVarargs(value: String*): Self = StObject.set(x, "healthCheckBlockingFirewallRules", js.Array(value*))
    
    inline def setHealthCheckFirewallState(value: String): Self = StObject.set(x, "healthCheckFirewallState", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckFirewallStateUndefined: Self = StObject.set(x, "healthCheckFirewallState", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
