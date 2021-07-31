package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipForUserLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipForUserLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsRemoveMembershipForUserLegacyEndpoint extends StObject {
  
  var parameters: TeamsRemoveMembershipForUserLegacyEndpoint
  
  var request: TeamsRemoveMembershipForUserLegacyRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsRemoveMembershipForUserLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsRemoveMembershipForUserLegacyEndpoint,
    request: TeamsRemoveMembershipForUserLegacyRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsRemoveMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveMembershipForUserLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsRemoveMembershipForUserLegacyEndpointMutableBuilder[Self <: ParametersTeamsRemoveMembershipForUserLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsRemoveMembershipForUserLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsRemoveMembershipForUserLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
