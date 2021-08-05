package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RRSetRoutingPolicy extends StObject {
  
  var geoPolicy: js.UndefOr[RRSetRoutingPolicyGeoPolicy] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var wrrPolicy: js.UndefOr[RRSetRoutingPolicyWrrPolicy] = js.undefined
}
object RRSetRoutingPolicy {
  
  inline def apply(): RRSetRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicy]
  }
  
  extension [Self <: RRSetRoutingPolicy](x: Self) {
    
    inline def setGeoPolicy(value: RRSetRoutingPolicyGeoPolicy): Self = StObject.set(x, "geoPolicy", value.asInstanceOf[js.Any])
    
    inline def setGeoPolicyUndefined: Self = StObject.set(x, "geoPolicy", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setWrrPolicy(value: RRSetRoutingPolicyWrrPolicy): Self = StObject.set(x, "wrrPolicy", value.asInstanceOf[js.Any])
    
    inline def setWrrPolicyUndefined: Self = StObject.set(x, "wrrPolicy", js.undefined)
  }
}
