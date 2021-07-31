package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsCheckPermissionsForRepoLegacyEndpoint extends StObject {
  
  var parameters: TeamsCheckPermissionsForRepoLegacyEndpoint
  
  var request: TeamsCheckPermissionsForRepoLegacyRequestOptions
  
  var response: OctokitResponse[TeamsCheckPermissionsForRepoLegacyResponseData]
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
  implicit class ParametersTeamsCheckPermissionsForRepoLegacyEndpointMutableBuilder[Self <: ParametersTeamsCheckPermissionsForRepoLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCheckPermissionsForRepoLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCheckPermissionsForRepoLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCheckPermissionsForRepoLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
