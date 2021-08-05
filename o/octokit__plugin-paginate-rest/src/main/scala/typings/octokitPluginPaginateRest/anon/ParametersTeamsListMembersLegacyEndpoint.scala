package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListMembersLegacyEndpoint extends StObject {
  
  var parameters: TeamsListMembersLegacyEndpoint
  
  var response: OctokitResponse[TeamsListMembersLegacyResponseData]
}
object ParametersTeamsListMembersLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsListMembersLegacyEndpoint,
    response: OctokitResponse[TeamsListMembersLegacyResponseData]
  ): ParametersTeamsListMembersLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListMembersLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsListMembersLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListMembersLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListMembersLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
