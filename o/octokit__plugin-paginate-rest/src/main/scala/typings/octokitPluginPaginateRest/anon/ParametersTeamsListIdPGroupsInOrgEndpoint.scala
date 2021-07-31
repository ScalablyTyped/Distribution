package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListIdPGroupsInOrgEndpoint extends StObject {
  
  var parameters: TeamsListIdPGroupsInOrgEndpoint
  
  var response: OctokitResponse[TeamsListIdPGroupsInOrgResponseData] & `7`
}
object ParametersTeamsListIdPGroupsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsInOrgEndpoint,
    response: OctokitResponse[TeamsListIdPGroupsInOrgResponseData] & `7`
  ): ParametersTeamsListIdPGroupsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListIdPGroupsInOrgEndpointMutableBuilder[Self <: ParametersTeamsListIdPGroupsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListIdPGroupsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListIdPGroupsInOrgResponseData] & `7`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
