package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipForUserInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveMembershipForUserInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsRemoveMembershipForUserInOrgEndpoint extends StObject {
  
  var parameters: TeamsRemoveMembershipForUserInOrgEndpoint
  
  var request: TeamsRemoveMembershipForUserInOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsRemoveMembershipForUserInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsRemoveMembershipForUserInOrgEndpoint,
    request: TeamsRemoveMembershipForUserInOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsRemoveMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveMembershipForUserInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsRemoveMembershipForUserInOrgEndpointMutableBuilder[Self <: ParametersTeamsRemoveMembershipForUserInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsRemoveMembershipForUserInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsRemoveMembershipForUserInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
