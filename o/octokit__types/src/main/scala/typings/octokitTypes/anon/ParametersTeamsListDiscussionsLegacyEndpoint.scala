package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListDiscussionsLegacyEndpoint extends StObject {
  
  var parameters: TeamsListDiscussionsLegacyEndpoint
  
  var request: TeamsListDiscussionsLegacyRequestOptions
  
  var response: OctokitResponse[TeamsListDiscussionsLegacyResponseData]
}
object ParametersTeamsListDiscussionsLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsListDiscussionsLegacyEndpoint,
    request: TeamsListDiscussionsLegacyRequestOptions,
    response: OctokitResponse[TeamsListDiscussionsLegacyResponseData]
  ): ParametersTeamsListDiscussionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionsLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsListDiscussionsLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListDiscussionsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsListDiscussionsLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListDiscussionsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
