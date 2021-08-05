package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsDeleteLegacyEndpoint extends StObject {
  
  var parameters: TeamsDeleteLegacyEndpoint
  
  var request: TeamsDeleteLegacyRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsDeleteLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsDeleteLegacyEndpoint,
    request: TeamsDeleteLegacyRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsDeleteLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsDeleteLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsDeleteLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
