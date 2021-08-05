package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListIdPGroupsForLegacyEndpoint extends StObject {
  
  var parameters: TeamsListIdPGroupsForLegacyEndpoint
  
  var request: TeamsListIdPGroupsForLegacyRequestOptions
  
  var response: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData]
}
object ParametersTeamsListIdPGroupsForLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsListIdPGroupsForLegacyEndpoint,
    request: TeamsListIdPGroupsForLegacyRequestOptions,
    response: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData]
  ): ParametersTeamsListIdPGroupsForLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsListIdPGroupsForLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListIdPGroupsForLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsListIdPGroupsForLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
