package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveTeamAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveTeamAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveTeamAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposRemoveTeamAccessRestrictionsEndpoint extends js.Object {
  
  var parameters: ReposRemoveTeamAccessRestrictionsEndpoint = js.native
  
  var request: ReposRemoveTeamAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposRemoveTeamAccessRestrictionsResponseData] = js.native
}
object ParametersReposRemoveTeamAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposRemoveTeamAccessRestrictionsEndpoint,
    request: ReposRemoveTeamAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveTeamAccessRestrictionsResponseData]
  ): ParametersReposRemoveTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveTeamAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposRemoveTeamAccessRestrictionsEndpointOps[Self <: ParametersReposRemoveTeamAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposRemoveTeamAccessRestrictionsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposRemoveTeamAccessRestrictionsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRemoveTeamAccessRestrictionsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
