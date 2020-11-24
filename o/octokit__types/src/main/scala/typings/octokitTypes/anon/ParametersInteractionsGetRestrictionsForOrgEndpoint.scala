package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInteractionsGetRestrictionsForOrgEndpoint extends js.Object {
  
  var parameters: InteractionsGetRestrictionsForOrgEndpoint = js.native
  
  var request: InteractionsGetRestrictionsForOrgRequestOptions = js.native
  
  var response: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData] = js.native
}
object ParametersInteractionsGetRestrictionsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsGetRestrictionsForOrgEndpoint,
    request: InteractionsGetRestrictionsForOrgRequestOptions,
    response: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData]
  ): ParametersInteractionsGetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsGetRestrictionsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsGetRestrictionsForOrgEndpointOps[Self <: ParametersInteractionsGetRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: InteractionsGetRestrictionsForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsGetRestrictionsForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
