package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RRSetRoutingPolicyWrrPolicyWrrPolicyItem extends StObject {
  
  var kind: js.UndefOr[String] = js.native
  
  var rrdatas: js.UndefOr[js.Array[String]] = js.native
  
  /** DNSSEC generated signatures for the above wrr_rrdata. */
  var signatureRrdatas: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems are configured, the probability of returning an rrset is proportional to its weight
    * relative to the sum of weights configured for all items. This weight should be a decimal in the range [0,1].
    */
  var weight: js.UndefOr[Double] = js.native
}
object RRSetRoutingPolicyWrrPolicyWrrPolicyItem {
  
  @scala.inline
  def apply(): RRSetRoutingPolicyWrrPolicyWrrPolicyItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyWrrPolicyWrrPolicyItem]
  }
  
  @scala.inline
  implicit class RRSetRoutingPolicyWrrPolicyWrrPolicyItemMutableBuilder[Self <: RRSetRoutingPolicyWrrPolicyWrrPolicyItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRrdatas(value: js.Array[String]): Self = StObject.set(x, "rrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrdatasUndefined: Self = StObject.set(x, "rrdatas", js.undefined)
    
    @scala.inline
    def setRrdatasVarargs(value: String*): Self = StObject.set(x, "rrdatas", js.Array(value :_*))
    
    @scala.inline
    def setSignatureRrdatas(value: js.Array[String]): Self = StObject.set(x, "signatureRrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureRrdatasUndefined: Self = StObject.set(x, "signatureRrdatas", js.undefined)
    
    @scala.inline
    def setSignatureRrdatasVarargs(value: String*): Self = StObject.set(x, "signatureRrdatas", js.Array(value :_*))
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
