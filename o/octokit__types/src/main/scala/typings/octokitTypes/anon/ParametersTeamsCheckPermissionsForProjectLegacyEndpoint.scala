package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCheckPermissionsForProjectLegacyEndpoint extends js.Object {
  
  var parameters: TeamsCheckPermissionsForProjectLegacyEndpoint = js.native
  
  var request: TeamsCheckPermissionsForProjectLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCheckPermissionsForProjectLegacyResponseData] = js.native
}
object ParametersTeamsCheckPermissionsForProjectLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCheckPermissionsForProjectLegacyEndpoint,
    request: TeamsCheckPermissionsForProjectLegacyRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForProjectLegacyResponseData]
  ): ParametersTeamsCheckPermissionsForProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForProjectLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCheckPermissionsForProjectLegacyEndpointOps[Self <: ParametersTeamsCheckPermissionsForProjectLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsCheckPermissionsForProjectLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCheckPermissionsForProjectLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCheckPermissionsForProjectLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
