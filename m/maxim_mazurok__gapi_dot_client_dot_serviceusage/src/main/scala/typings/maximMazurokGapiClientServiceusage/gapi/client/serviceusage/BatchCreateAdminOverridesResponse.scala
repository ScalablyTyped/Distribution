package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateAdminOverridesResponse extends StObject {
  
  /** The overrides that were created. */
  var overrides: js.UndefOr[js.Array[QuotaOverride]] = js.undefined
}
object BatchCreateAdminOverridesResponse {
  
  inline def apply(): BatchCreateAdminOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateAdminOverridesResponse]
  }
  
  extension [Self <: BatchCreateAdminOverridesResponse](x: Self) {
    
    inline def setOverrides(value: js.Array[QuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: QuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
