package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Beta1ImportProducerQuotaPoliciesResponse extends js.Object {
  
  /** The policies that were created from the imported data. */
  var policies: js.UndefOr[js.Array[V1Beta1ProducerQuotaPolicy]] = js.native
}
object V1Beta1ImportProducerQuotaPoliciesResponse {
  
  @scala.inline
  def apply(): V1Beta1ImportProducerQuotaPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1Beta1ImportProducerQuotaPoliciesResponse]
  }
  
  @scala.inline
  implicit class V1Beta1ImportProducerQuotaPoliciesResponseOps[Self <: V1Beta1ImportProducerQuotaPoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setPoliciesVarargs(value: V1Beta1ProducerQuotaPolicy*): Self = this.set("policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: js.Array[V1Beta1ProducerQuotaPolicy]): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
  }
}
