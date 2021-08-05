package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListMembersInOrgEndpoint extends StObject {
  
  var parameters: TeamsListMembersInOrgEndpoint
  
  var response: OctokitResponse[TeamsListMembersInOrgResponseData]
}
object ParametersTeamsListMembersInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsListMembersInOrgEndpoint,
    response: OctokitResponse[TeamsListMembersInOrgResponseData]
  ): ParametersTeamsListMembersInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListMembersInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsListMembersInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListMembersInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListMembersInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
