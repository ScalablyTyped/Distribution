package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RRSetRoutingPolicyGeoPolicy extends js.Object {
  
  /**
    * If the health check for the primary target for a geo location returns an unhealthy status, the failover target is returned instead. This failover configuration is not mandatory. If
    * a failover is not provided, the primary target won't be healthchecked - we'll return the primarily configured rrdata irrespective of whether it is healthy or not.
    */
  var failovers: js.UndefOr[js.Array[RRSetRoutingPolicyGeoPolicyGeoPolicyItem]] = js.native
  
  /** The primary geo routing configuration. If there are multiple items with the same location, an error is returned instead. */
  var items: js.UndefOr[js.Array[RRSetRoutingPolicyGeoPolicyGeoPolicyItem]] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object RRSetRoutingPolicyGeoPolicy {
  
  @scala.inline
  def apply(): RRSetRoutingPolicyGeoPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyGeoPolicy]
  }
  
  @scala.inline
  implicit class RRSetRoutingPolicyGeoPolicyOps[Self <: RRSetRoutingPolicyGeoPolicy] (val x: Self) extends AnyVal {
    
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
    def setFailoversVarargs(value: RRSetRoutingPolicyGeoPolicyGeoPolicyItem*): Self = this.set("failovers", js.Array(value :_*))
    
    @scala.inline
    def setFailovers(value: js.Array[RRSetRoutingPolicyGeoPolicyGeoPolicyItem]): Self = this.set("failovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailovers: Self = this.set("failovers", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RRSetRoutingPolicyGeoPolicyGeoPolicyItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[RRSetRoutingPolicyGeoPolicyGeoPolicyItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
