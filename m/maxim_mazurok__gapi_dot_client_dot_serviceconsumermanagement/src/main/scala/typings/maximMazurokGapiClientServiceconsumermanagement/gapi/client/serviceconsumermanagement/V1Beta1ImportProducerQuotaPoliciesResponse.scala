package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V1Beta1ImportProducerQuotaPoliciesResponse extends StObject {
  
  /** The policies that were created from the imported data. */
  var policies: js.UndefOr[js.Array[V1Beta1ProducerQuotaPolicy]] = js.undefined
}
object V1Beta1ImportProducerQuotaPoliciesResponse {
  
  inline def apply(): V1Beta1ImportProducerQuotaPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1Beta1ImportProducerQuotaPoliciesResponse]
  }
  
  extension [Self <: V1Beta1ImportProducerQuotaPoliciesResponse](x: Self) {
    
    inline def setPolicies(value: js.Array[V1Beta1ProducerQuotaPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: V1Beta1ProducerQuotaPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
