package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetRepoSecretEndpoint extends js.Object {
  
  var parameters: ActionsGetRepoSecretEndpoint = js.native
  
  var request: ActionsGetRepoSecretRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetRepoSecretResponseData] = js.native
}
object ParametersActionsGetRepoSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetRepoSecretEndpoint,
    request: ActionsGetRepoSecretRequestOptions,
    response: OctokitResponse[ActionsGetRepoSecretResponseData]
  ): ParametersActionsGetRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetRepoSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetRepoSecretEndpointOps[Self <: ParametersActionsGetRepoSecretEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsGetRepoSecretEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetRepoSecretRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetRepoSecretResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
