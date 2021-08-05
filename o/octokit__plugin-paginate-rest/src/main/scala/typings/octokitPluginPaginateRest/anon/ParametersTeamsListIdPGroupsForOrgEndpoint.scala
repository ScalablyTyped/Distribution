package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListIdPGroupsForOrgEndpoint extends StObject {
  
  var parameters: TeamsListIdPGroupsForOrgEndpoint
  
  var response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] & `7`
}
object ParametersTeamsListIdPGroupsForOrgEndpoint {
  
  inline def apply(
    parameters: TeamsListIdPGroupsForOrgEndpoint,
    response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] & `7`
  ): ParametersTeamsListIdPGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsListIdPGroupsForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListIdPGroupsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] & `7`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
