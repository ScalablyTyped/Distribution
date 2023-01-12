package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateConsumerOverridesResponse extends StObject {
  
  /** The overrides that were created. */
  var overrides: js.UndefOr[js.Array[QuotaOverride]] = js.undefined
}
object BatchCreateConsumerOverridesResponse {
  
  inline def apply(): BatchCreateConsumerOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateConsumerOverridesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateConsumerOverridesResponse] (val x: Self) extends AnyVal {
    
    inline def setOverrides(value: js.Array[QuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: QuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
