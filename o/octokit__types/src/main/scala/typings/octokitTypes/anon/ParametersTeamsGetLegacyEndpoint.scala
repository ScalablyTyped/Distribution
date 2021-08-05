package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsGetLegacyEndpoint extends StObject {
  
  var parameters: TeamsGetLegacyEndpoint
  
  var request: TeamsGetLegacyRequestOptions
  
  var response: OctokitResponse[TeamsGetLegacyResponseData]
}
object ParametersTeamsGetLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsGetLegacyEndpoint,
    request: TeamsGetLegacyRequestOptions,
    response: OctokitResponse[TeamsGetLegacyResponseData]
  ): ParametersTeamsGetLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsGetLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsGetLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsGetLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsGetLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
