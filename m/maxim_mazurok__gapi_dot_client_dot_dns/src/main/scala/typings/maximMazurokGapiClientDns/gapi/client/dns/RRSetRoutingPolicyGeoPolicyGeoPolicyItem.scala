package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RRSetRoutingPolicyGeoPolicyGeoPolicyItem extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** The geo-location granularity is a GCP region. This location string should correspond to a GCP region. e.g "us-east1", "southamerica-east1", "asia-east1", etc. */
  var location: js.UndefOr[String] = js.undefined
  
  var rrdatas: js.UndefOr[js.Array[String]] = js.undefined
  
  /** DNSSEC generated signatures for the above geo_rrdata. */
  var signatureRrdatas: js.UndefOr[js.Array[String]] = js.undefined
}
object RRSetRoutingPolicyGeoPolicyGeoPolicyItem {
  
  inline def apply(): RRSetRoutingPolicyGeoPolicyGeoPolicyItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyGeoPolicyGeoPolicyItem]
  }
  
  extension [Self <: RRSetRoutingPolicyGeoPolicyGeoPolicyItem](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRrdatas(value: js.Array[String]): Self = StObject.set(x, "rrdatas", value.asInstanceOf[js.Any])
    
    inline def setRrdatasUndefined: Self = StObject.set(x, "rrdatas", js.undefined)
    
    inline def setRrdatasVarargs(value: String*): Self = StObject.set(x, "rrdatas", js.Array(value :_*))
    
    inline def setSignatureRrdatas(value: js.Array[String]): Self = StObject.set(x, "signatureRrdatas", value.asInstanceOf[js.Any])
    
    inline def setSignatureRrdatasUndefined: Self = StObject.set(x, "signatureRrdatas", js.undefined)
    
    inline def setSignatureRrdatasVarargs(value: String*): Self = StObject.set(x, "signatureRrdatas", js.Array(value :_*))
  }
}
