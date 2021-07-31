package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveRepoLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveRepoLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsRemoveRepoLegacyEndpoint extends StObject {
  
  var parameters: TeamsRemoveRepoLegacyEndpoint
  
  var request: TeamsRemoveRepoLegacyRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsRemoveRepoLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsRemoveRepoLegacyEndpoint,
    request: TeamsRemoveRepoLegacyRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsRemoveRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveRepoLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsRemoveRepoLegacyEndpointMutableBuilder[Self <: ParametersTeamsRemoveRepoLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsRemoveRepoLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsRemoveRepoLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
