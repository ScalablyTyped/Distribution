package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRolesResponse extends js.Object {
  
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
  implicit class AddRolesResponseOps[Self <: AddRolesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPolicyBindingVarargs(value: PolicyBinding*): Self = this.set("policyBinding", js.Array(value :_*))
    
    @scala.inline
    def setPolicyBinding(value: js.Array[PolicyBinding]): Self = this.set("policyBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyBinding: Self = this.set("policyBinding", js.undefined)
  }
}
