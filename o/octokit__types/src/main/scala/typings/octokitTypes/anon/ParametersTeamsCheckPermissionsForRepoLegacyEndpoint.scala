package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCheckPermissionsForRepoLegacyEndpoint extends js.Object {
  
  var parameters: TeamsCheckPermissionsForRepoLegacyEndpoint = js.native
  
  var request: TeamsCheckPermissionsForRepoLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCheckPermissionsForRepoLegacyResponseData] = js.native
}
object ParametersTeamsCheckPermissionsForRepoLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCheckPermissionsForRepoLegacyEndpoint,
    request: TeamsCheckPermissionsForRepoLegacyRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForRepoLegacyResponseData]
  ): ParametersTeamsCheckPermissionsForRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForRepoLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCheckPermissionsForRepoLegacyEndpointOps[Self <: ParametersTeamsCheckPermissionsForRepoLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsCheckPermissionsForRepoLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCheckPermissionsForRepoLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCheckPermissionsForRepoLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
