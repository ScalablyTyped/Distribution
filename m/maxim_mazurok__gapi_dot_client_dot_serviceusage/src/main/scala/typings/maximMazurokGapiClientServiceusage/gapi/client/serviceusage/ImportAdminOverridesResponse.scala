package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAdminOverridesResponse extends StObject {
  
  /** The overrides that were created from the imported data. */
  var overrides: js.UndefOr[js.Array[QuotaOverride]] = js.native
}
object ImportAdminOverridesResponse {
  
  @scala.inline
  def apply(): ImportAdminOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportAdminOverridesResponse]
  }
  
  @scala.inline
  implicit class ImportAdminOverridesResponseMutableBuilder[Self <: ImportAdminOverridesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrides(value: js.Array[QuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: QuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value :_*))
  }
}
