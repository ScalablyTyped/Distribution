package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListProjectsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListProjectsLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListProjectsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListProjectsLegacyEndpoint extends StObject {
  
  var parameters: TeamsListProjectsLegacyEndpoint
  
  var request: TeamsListProjectsLegacyRequestOptions
  
  var response: OctokitResponse[TeamsListProjectsLegacyResponseData]
}
object ParametersTeamsListProjectsLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsListProjectsLegacyEndpoint,
    request: TeamsListProjectsLegacyRequestOptions,
    response: OctokitResponse[TeamsListProjectsLegacyResponseData]
  ): ParametersTeamsListProjectsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsListProjectsLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListProjectsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsListProjectsLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListProjectsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
