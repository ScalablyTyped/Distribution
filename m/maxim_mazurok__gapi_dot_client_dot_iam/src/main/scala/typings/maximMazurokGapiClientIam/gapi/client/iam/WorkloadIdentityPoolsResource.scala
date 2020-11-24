package typings.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkloadIdentityPoolsResource extends js.Object {
  
  var operations: OperationsResource = js.native
  
  var providers: ProvidersResource = js.native
}
object WorkloadIdentityPoolsResource {
  
  @scala.inline
  def apply(operations: OperationsResource, providers: ProvidersResource): WorkloadIdentityPoolsResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkloadIdentityPoolsResource]
  }
  
  @scala.inline
  implicit class WorkloadIdentityPoolsResourceOps[Self <: WorkloadIdentityPoolsResource] (val x: Self) extends AnyVal {
    
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
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(value: ProvidersResource): Self = this.set("providers", value.asInstanceOf[js.Any])
  }
}
