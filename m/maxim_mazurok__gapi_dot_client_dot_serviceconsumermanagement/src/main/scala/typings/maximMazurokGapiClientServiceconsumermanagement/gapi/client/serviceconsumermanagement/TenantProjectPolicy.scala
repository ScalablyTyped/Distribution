package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TenantProjectPolicy extends StObject {
  
  /** Policy bindings to be applied to the tenant project, in addition to the 'roles/owner' role granted to the Service Consumer Management service account. */
  var policyBindings: js.UndefOr[js.Array[PolicyBinding]] = js.undefined
}
object TenantProjectPolicy {
  
  inline def apply(): TenantProjectPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenantProjectPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TenantProjectPolicy] (val x: Self) extends AnyVal {
    
    inline def setPolicyBindings(value: js.Array[PolicyBinding]): Self = StObject.set(x, "policyBindings", value.asInstanceOf[js.Any])
    
    inline def setPolicyBindingsUndefined: Self = StObject.set(x, "policyBindings", js.undefined)
    
    inline def setPolicyBindingsVarargs(value: PolicyBinding*): Self = StObject.set(x, "policyBindings", js.Array(value*))
  }
}
