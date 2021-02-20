package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoPermissionsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoPermissionsLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsAddOrUpdateRepoPermissionsLegacyEndpoint extends StObject {
  
  var parameters: TeamsAddOrUpdateRepoPermissionsLegacyEndpoint = js.native
  
  var request: TeamsAddOrUpdateRepoPermissionsLegacyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsAddOrUpdateRepoPermissionsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateRepoPermissionsLegacyEndpoint,
    request: TeamsAddOrUpdateRepoPermissionsLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsAddOrUpdateRepoPermissionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateRepoPermissionsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsAddOrUpdateRepoPermissionsLegacyEndpointMutableBuilder[Self <: ParametersTeamsAddOrUpdateRepoPermissionsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsAddOrUpdateRepoPermissionsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsAddOrUpdateRepoPermissionsLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
