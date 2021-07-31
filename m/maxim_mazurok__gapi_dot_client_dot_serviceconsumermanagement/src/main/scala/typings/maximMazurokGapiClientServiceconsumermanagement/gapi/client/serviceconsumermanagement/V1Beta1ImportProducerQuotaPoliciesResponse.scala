package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V1Beta1ImportProducerQuotaPoliciesResponse extends StObject {
  
  /** The policies that were created from the imported data. */
  var policies: js.UndefOr[js.Array[V1Beta1ProducerQuotaPolicy]] = js.undefined
}
object V1Beta1ImportProducerQuotaPoliciesResponse {
  
  @scala.inline
  def apply(): V1Beta1ImportProducerQuotaPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1Beta1ImportProducerQuotaPoliciesResponse]
  }
  
  @scala.inline
  implicit class V1Beta1ImportProducerQuotaPoliciesResponseMutableBuilder[Self <: V1Beta1ImportProducerQuotaPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicies(value: js.Array[V1Beta1ProducerQuotaPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: V1Beta1ProducerQuotaPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
