package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V1Beta1BatchCreateProducerOverridesResponse extends StObject {
  
  /** The overrides that were created. */
  var overrides: js.UndefOr[js.Array[V1Beta1QuotaOverride]] = js.undefined
}
object V1Beta1BatchCreateProducerOverridesResponse {
  
  inline def apply(): V1Beta1BatchCreateProducerOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1Beta1BatchCreateProducerOverridesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: V1Beta1BatchCreateProducerOverridesResponse] (val x: Self) extends AnyVal {
    
    inline def setOverrides(value: js.Array[V1Beta1QuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: V1Beta1QuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
