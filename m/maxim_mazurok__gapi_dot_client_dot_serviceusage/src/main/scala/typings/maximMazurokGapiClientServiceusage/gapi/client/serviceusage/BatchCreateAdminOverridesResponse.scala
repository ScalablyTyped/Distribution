package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateAdminOverridesResponse extends StObject {
  
  /** The overrides that were created. */
  var overrides: js.UndefOr[js.Array[QuotaOverride]] = js.undefined
}
object BatchCreateAdminOverridesResponse {
  
  @scala.inline
  def apply(): BatchCreateAdminOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateAdminOverridesResponse]
  }
  
  @scala.inline
  implicit class BatchCreateAdminOverridesResponseMutableBuilder[Self <: BatchCreateAdminOverridesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrides(value: js.Array[QuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: QuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value :_*))
  }
}
