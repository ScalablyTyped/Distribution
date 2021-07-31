package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListMembersInOrgEndpoint extends StObject {
  
  var parameters: TeamsListMembersInOrgEndpoint
  
  var request: TeamsListMembersInOrgRequestOptions
  
  var response: OctokitResponse[TeamsListMembersInOrgResponseData]
}
object ParametersTeamsListMembersInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListMembersInOrgEndpoint,
    request: TeamsListMembersInOrgRequestOptions,
    response: OctokitResponse[TeamsListMembersInOrgResponseData]
  ): ParametersTeamsListMembersInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListMembersInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListMembersInOrgEndpointMutableBuilder[Self <: ParametersTeamsListMembersInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListMembersInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListMembersInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListMembersInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
