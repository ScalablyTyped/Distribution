package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RRSetRoutingPolicyWrrPolicyWrrPolicyItem extends js.Object {
  
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
  implicit class RRSetRoutingPolicyWrrPolicyWrrPolicyItemOps[Self <: RRSetRoutingPolicyWrrPolicyWrrPolicyItem] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRrdatasVarargs(value: String*): Self = this.set("rrdatas", js.Array(value :_*))
    
    @scala.inline
    def setRrdatas(value: js.Array[String]): Self = this.set("rrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRrdatas: Self = this.set("rrdatas", js.undefined)
    
    @scala.inline
    def setSignatureRrdatasVarargs(value: String*): Self = this.set("signatureRrdatas", js.Array(value :_*))
    
    @scala.inline
    def setSignatureRrdatas(value: js.Array[String]): Self = this.set("signatureRrdatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureRrdatas: Self = this.set("signatureRrdatas", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
