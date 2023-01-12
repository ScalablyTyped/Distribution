package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAdminQuotaPoliciesResponse extends StObject {
  
  /** The policies that were created from the imported data. */
  var policies: js.UndefOr[js.Array[AdminQuotaPolicy]] = js.undefined
}
object ImportAdminQuotaPoliciesResponse {
  
  inline def apply(): ImportAdminQuotaPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportAdminQuotaPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportAdminQuotaPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicies(value: js.Array[AdminQuotaPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: AdminQuotaPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
