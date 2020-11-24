package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRolesRequest extends js.Object {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is a project number, as in
    * '12345' {network} is a network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.native
  
  /** Required. List of policy bindings to add to shared VPC host project. */
  var policyBinding: js.UndefOr[js.Array[PolicyBinding]] = js.native
}
object AddRolesRequest {
  
  @scala.inline
  def apply(): AddRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddRolesRequest]
  }
  
  @scala.inline
  implicit class AddRolesRequestOps[Self <: AddRolesRequest] (val x: Self) extends AnyVal {
    
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
    def setConsumerNetwork(value: String): Self = this.set("consumerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerNetwork: Self = this.set("consumerNetwork", js.undefined)
    
    @scala.inline
    def setPolicyBindingVarargs(value: PolicyBinding*): Self = this.set("policyBinding", js.Array(value :_*))
    
    @scala.inline
    def setPolicyBinding(value: js.Array[PolicyBinding]): Self = this.set("policyBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyBinding: Self = this.set("policyBinding", js.undefined)
  }
}
