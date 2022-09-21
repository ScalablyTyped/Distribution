package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RRSetRoutingPolicyHealthCheckTargets extends StObject {
  
  var internalLoadBalancers: js.UndefOr[js.Array[RRSetRoutingPolicyLoadBalancerTarget]] = js.undefined
}
object RRSetRoutingPolicyHealthCheckTargets {
  
  inline def apply(): RRSetRoutingPolicyHealthCheckTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyHealthCheckTargets]
  }
  
  extension [Self <: RRSetRoutingPolicyHealthCheckTargets](x: Self) {
    
    inline def setInternalLoadBalancers(value: js.Array[RRSetRoutingPolicyLoadBalancerTarget]): Self = StObject.set(x, "internalLoadBalancers", value.asInstanceOf[js.Any])
    
    inline def setInternalLoadBalancersUndefined: Self = StObject.set(x, "internalLoadBalancers", js.undefined)
    
    inline def setInternalLoadBalancersVarargs(value: RRSetRoutingPolicyLoadBalancerTarget*): Self = StObject.set(x, "internalLoadBalancers", js.Array(value*))
  }
}
