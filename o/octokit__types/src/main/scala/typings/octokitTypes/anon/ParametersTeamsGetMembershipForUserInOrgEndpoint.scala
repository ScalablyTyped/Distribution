package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsGetMembershipForUserInOrgEndpoint extends StObject {
  
  var parameters: TeamsGetMembershipForUserInOrgEndpoint
  
  var request: TeamsGetMembershipForUserInOrgRequestOptions
  
  var response: OctokitResponse[TeamsGetMembershipForUserInOrgResponseData]
}
object ParametersTeamsGetMembershipForUserInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetMembershipForUserInOrgEndpoint,
    request: TeamsGetMembershipForUserInOrgRequestOptions,
    response: OctokitResponse[TeamsGetMembershipForUserInOrgResponseData]
  ): ParametersTeamsGetMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMembershipForUserInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetMembershipForUserInOrgEndpointMutableBuilder[Self <: ParametersTeamsGetMembershipForUserInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsGetMembershipForUserInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetMembershipForUserInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetMembershipForUserInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
