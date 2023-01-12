package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RRSetRoutingPolicyWrrPolicyWrrPolicyItem extends StObject {
  
  /**
    * endpoints that need to be health checked before making the routing decision. The unhealthy endpoints will be omitted from the result. If all endpoints within a buckete are
    * unhealthy, we'll choose a different bucket (sampled w.r.t. its weight) for responding. Note that if DNSSEC is enabled for this zone, only one of rrdata or health_checked_targets can
    * be set.
    */
  var healthCheckedTargets: js.UndefOr[RRSetRoutingPolicyHealthCheckTargets] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var rrdatas: js.UndefOr[js.Array[String]] = js.undefined
  
  /** DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there's a restriction of 1 ip per item. . */
  var signatureRrdatas: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems are configured, the probability of returning an rrset is proportional to its weight
    * relative to the sum of weights configured for all items. This weight should be non-negative.
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object RRSetRoutingPolicyWrrPolicyWrrPolicyItem {
  
  inline def apply(): RRSetRoutingPolicyWrrPolicyWrrPolicyItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyWrrPolicyWrrPolicyItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RRSetRoutingPolicyWrrPolicyWrrPolicyItem] (val x: Self) extends AnyVal {
    
    inline def setHealthCheckedTargets(value: RRSetRoutingPolicyHealthCheckTargets): Self = StObject.set(x, "healthCheckedTargets", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckedTargetsUndefined: Self = StObject.set(x, "healthCheckedTargets", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRrdatas(value: js.Array[String]): Self = StObject.set(x, "rrdatas", value.asInstanceOf[js.Any])
    
    inline def setRrdatasUndefined: Self = StObject.set(x, "rrdatas", js.undefined)
    
    inline def setRrdatasVarargs(value: String*): Self = StObject.set(x, "rrdatas", js.Array(value*))
    
    inline def setSignatureRrdatas(value: js.Array[String]): Self = StObject.set(x, "signatureRrdatas", value.asInstanceOf[js.Any])
    
    inline def setSignatureRrdatasUndefined: Self = StObject.set(x, "signatureRrdatas", js.undefined)
    
    inline def setSignatureRrdatasVarargs(value: String*): Self = StObject.set(x, "signatureRrdatas", js.Array(value*))
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
