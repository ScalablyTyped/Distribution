package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCheckPermissionsForRepoInOrgEndpoint extends js.Object {
  
  var parameters: TeamsCheckPermissionsForRepoInOrgEndpoint = js.native
  
  var request: TeamsCheckPermissionsForRepoInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData] = js.native
}
object ParametersTeamsCheckPermissionsForRepoInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCheckPermissionsForRepoInOrgEndpoint,
    request: TeamsCheckPermissionsForRepoInOrgRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]
  ): ParametersTeamsCheckPermissionsForRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForRepoInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCheckPermissionsForRepoInOrgEndpointOps[Self <: ParametersTeamsCheckPermissionsForRepoInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsCheckPermissionsForRepoInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCheckPermissionsForRepoInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
