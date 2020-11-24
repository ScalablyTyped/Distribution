package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyBinding extends js.Object {
  
  /**
    * Required. Member to bind the role with. See /iam/docs/reference/rest/v1/Policy#Binding for how to format each member. Eg. - user:myuser@mydomain.com -
    * serviceAccount:my-service-account@app.gserviceaccount.com
    */
  var member: js.UndefOr[String] = js.native
  
  /**
    * Required. Role to apply. Only allowlisted roles can be used at the specified granularity. The role must be one of the following: - 'roles/container.hostServiceAgentUser' applied on
    * the shared VPC host project - 'roles/compute.securityAdmin' applied on the shared VPC host project
    */
  var role: js.UndefOr[String] = js.native
}
object PolicyBinding {
  
  @scala.inline
  def apply(): PolicyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyBinding]
  }
  
  @scala.inline
  implicit class PolicyBindingOps[Self <: PolicyBinding] (val x: Self) extends AnyVal {
    
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
    def setMember(value: String): Self = this.set("member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMember: Self = this.set("member", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
