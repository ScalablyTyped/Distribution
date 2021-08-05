package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RRSetRoutingPolicyWrrPolicyWrrPolicyItem extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  var rrdatas: js.UndefOr[js.Array[String]] = js.undefined
  
  /** DNSSEC generated signatures for the above wrr_rrdata. */
  var signatureRrdatas: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems are configured, the probability of returning an rrset is proportional to its weight
    * relative to the sum of weights configured for all items. This weight should be a decimal in the range [0,1].
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object RRSetRoutingPolicyWrrPolicyWrrPolicyItem {
  
  inline def apply(): RRSetRoutingPolicyWrrPolicyWrrPolicyItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyWrrPolicyWrrPolicyItem]
  }
  
  extension [Self <: RRSetRoutingPolicyWrrPolicyWrrPolicyItem](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRrdatas(value: js.Array[String]): Self = StObject.set(x, "rrdatas", value.asInstanceOf[js.Any])
    
    inline def setRrdatasUndefined: Self = StObject.set(x, "rrdatas", js.undefined)
    
    inline def setRrdatasVarargs(value: String*): Self = StObject.set(x, "rrdatas", js.Array(value :_*))
    
    inline def setSignatureRrdatas(value: js.Array[String]): Self = StObject.set(x, "signatureRrdatas", value.asInstanceOf[js.Any])
    
    inline def setSignatureRrdatasUndefined: Self = StObject.set(x, "signatureRrdatas", js.undefined)
    
    inline def setSignatureRrdatasVarargs(value: String*): Self = StObject.set(x, "signatureRrdatas", js.Array(value :_*))
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
