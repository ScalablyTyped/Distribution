package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ReposAddCollaboratorRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposAddCollaboratorEndpoint extends js.Object {
  
  var parameters: ReposAddCollaboratorEndpoint = js.native
  
  var request: ReposAddCollaboratorRequestOptions = js.native
  
  var response: OctokitResponse[ReposAddCollaboratorResponseData] = js.native
}
object ParametersReposAddCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposAddCollaboratorEndpoint,
    request: ReposAddCollaboratorRequestOptions,
    response: OctokitResponse[ReposAddCollaboratorResponseData]
  ): ParametersReposAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposAddCollaboratorEndpointOps[Self <: ParametersReposAddCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposAddCollaboratorEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposAddCollaboratorRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddCollaboratorResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
