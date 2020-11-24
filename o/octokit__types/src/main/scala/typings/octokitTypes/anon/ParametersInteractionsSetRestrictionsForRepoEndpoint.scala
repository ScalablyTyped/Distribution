package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInteractionsSetRestrictionsForRepoEndpoint extends js.Object {
  
  var parameters: InteractionsSetRestrictionsForRepoEndpoint = js.native
  
  var request: InteractionsSetRestrictionsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData] = js.native
}
object ParametersInteractionsSetRestrictionsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsSetRestrictionsForRepoEndpoint,
    request: InteractionsSetRestrictionsForRepoRequestOptions,
    response: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]
  ): ParametersInteractionsSetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsSetRestrictionsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsSetRestrictionsForRepoEndpointOps[Self <: ParametersInteractionsSetRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: InteractionsSetRestrictionsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsSetRestrictionsForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
