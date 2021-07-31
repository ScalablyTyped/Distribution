package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RRSetRoutingPolicyGeoPolicy extends StObject {
  
  /**
    * If the health check for the primary target for a geo location returns an unhealthy status, the failover target is returned instead. This failover configuration is not mandatory. If
    * a failover is not provided, the primary target won't be healthchecked - we'll return the primarily configured rrdata irrespective of whether it is healthy or not.
    */
  var failovers: js.UndefOr[js.Array[RRSetRoutingPolicyGeoPolicyGeoPolicyItem]] = js.undefined
  
  /** The primary geo routing configuration. If there are multiple items with the same location, an error is returned instead. */
  var items: js.UndefOr[js.Array[RRSetRoutingPolicyGeoPolicyGeoPolicyItem]] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object RRSetRoutingPolicyGeoPolicy {
  
  @scala.inline
  def apply(): RRSetRoutingPolicyGeoPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyGeoPolicy]
  }
  
  @scala.inline
  implicit class RRSetRoutingPolicyGeoPolicyMutableBuilder[Self <: RRSetRoutingPolicyGeoPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailovers(value: js.Array[RRSetRoutingPolicyGeoPolicyGeoPolicyItem]): Self = StObject.set(x, "failovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoversUndefined: Self = StObject.set(x, "failovers", js.undefined)
    
    @scala.inline
    def setFailoversVarargs(value: RRSetRoutingPolicyGeoPolicyGeoPolicyItem*): Self = StObject.set(x, "failovers", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[RRSetRoutingPolicyGeoPolicyGeoPolicyItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RRSetRoutingPolicyGeoPolicyGeoPolicyItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
