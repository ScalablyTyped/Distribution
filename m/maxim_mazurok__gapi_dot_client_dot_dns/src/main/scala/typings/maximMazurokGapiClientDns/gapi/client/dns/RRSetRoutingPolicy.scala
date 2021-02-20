package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RRSetRoutingPolicy extends StObject {
  
  var geoPolicy: js.UndefOr[RRSetRoutingPolicyGeoPolicy] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var wrrPolicy: js.UndefOr[RRSetRoutingPolicyWrrPolicy] = js.native
}
object RRSetRoutingPolicy {
  
  @scala.inline
  def apply(): RRSetRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicy]
  }
  
  @scala.inline
  implicit class RRSetRoutingPolicyMutableBuilder[Self <: RRSetRoutingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoPolicy(value: RRSetRoutingPolicyGeoPolicy): Self = StObject.set(x, "geoPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoPolicyUndefined: Self = StObject.set(x, "geoPolicy", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setWrrPolicy(value: RRSetRoutingPolicyWrrPolicy): Self = StObject.set(x, "wrrPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrrPolicyUndefined: Self = StObject.set(x, "wrrPolicy", js.undefined)
  }
}
