package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListIdPGroupsForOrgEndpoint extends StObject {
  
  var parameters: TeamsListIdPGroupsForOrgEndpoint
  
  var request: TeamsListIdPGroupsForOrgRequestOptions
  
  var response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData]
}
object ParametersTeamsListIdPGroupsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsForOrgEndpoint,
    request: TeamsListIdPGroupsForOrgRequestOptions,
    response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData]
  ): ParametersTeamsListIdPGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListIdPGroupsForOrgEndpointMutableBuilder[Self <: ParametersTeamsListIdPGroupsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListIdPGroupsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListIdPGroupsForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListIdPGroupsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
