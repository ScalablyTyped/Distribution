package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInteractionsRemoveRestrictionsForOrgEndpoint extends js.Object {
  
  var parameters: InteractionsRemoveRestrictionsForOrgEndpoint = js.native
  
  var request: InteractionsRemoveRestrictionsForOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersInteractionsRemoveRestrictionsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsRemoveRestrictionsForOrgEndpoint,
    request: InteractionsRemoveRestrictionsForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersInteractionsRemoveRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsRemoveRestrictionsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsRemoveRestrictionsForOrgEndpointOps[Self <: ParametersInteractionsRemoveRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: InteractionsRemoveRestrictionsForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsRemoveRestrictionsForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
