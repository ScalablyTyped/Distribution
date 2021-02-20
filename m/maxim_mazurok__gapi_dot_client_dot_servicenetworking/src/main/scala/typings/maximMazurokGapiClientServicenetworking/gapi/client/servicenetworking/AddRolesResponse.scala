package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRolesResponse extends StObject {
  
  /** Required. List of policy bindings that were added to the shared VPC host project. */
  var policyBinding: js.UndefOr[js.Array[PolicyBinding]] = js.native
}
object AddRolesResponse {
  
  @scala.inline
  def apply(): AddRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddRolesResponse]
  }
  
  @scala.inline
  implicit class AddRolesResponseMutableBuilder[Self <: AddRolesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyBinding(value: js.Array[PolicyBinding]): Self = StObject.set(x, "policyBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyBindingUndefined: Self = StObject.set(x, "policyBinding", js.undefined)
    
    @scala.inline
    def setPolicyBindingVarargs(value: PolicyBinding*): Self = StObject.set(x, "policyBinding", js.Array(value :_*))
  }
}
