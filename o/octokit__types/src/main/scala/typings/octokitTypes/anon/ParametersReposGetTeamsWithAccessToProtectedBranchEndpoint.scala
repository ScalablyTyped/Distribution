package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint extends js.Object {
  
  var parameters: ReposGetTeamsWithAccessToProtectedBranchEndpoint = js.native
  
  var request: ReposGetTeamsWithAccessToProtectedBranchRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData] = js.native
}
object ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetTeamsWithAccessToProtectedBranchEndpoint,
    request: ReposGetTeamsWithAccessToProtectedBranchRequestOptions,
    response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]
  ): ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetTeamsWithAccessToProtectedBranchEndpointOps[Self <: ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetTeamsWithAccessToProtectedBranchEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetTeamsWithAccessToProtectedBranchRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
