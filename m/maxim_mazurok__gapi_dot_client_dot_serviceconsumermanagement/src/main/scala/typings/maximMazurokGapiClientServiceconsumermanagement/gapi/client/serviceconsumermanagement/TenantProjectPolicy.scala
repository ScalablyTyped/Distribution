package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TenantProjectPolicy extends js.Object {
  
  /**
    * Policy bindings to be applied to the tenant project, in addition to the 'roles/owner' role granted to the Service Consumer Management service account. At least one binding must have
    * the role `roles/owner`. Among the list of members for `roles/owner`, at least one of them must be either the `user` or `group` type.
    */
  var policyBindings: js.UndefOr[js.Array[PolicyBinding]] = js.native
}
object TenantProjectPolicy {
  
  @scala.inline
  def apply(): TenantProjectPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenantProjectPolicy]
  }
  
  @scala.inline
  implicit class TenantProjectPolicyOps[Self <: TenantProjectPolicy] (val x: Self) extends AnyVal {
    
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
    def setPolicyBindingsVarargs(value: PolicyBinding*): Self = this.set("policyBindings", js.Array(value :_*))
    
    @scala.inline
    def setPolicyBindings(value: js.Array[PolicyBinding]): Self = this.set("policyBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyBindings: Self = this.set("policyBindings", js.undefined)
  }
}
