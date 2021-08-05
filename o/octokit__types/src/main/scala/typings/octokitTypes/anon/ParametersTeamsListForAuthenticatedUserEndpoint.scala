package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: TeamsListForAuthenticatedUserEndpoint
  
  var request: TeamsListForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[TeamsListForAuthenticatedUserResponseData]
}
object ParametersTeamsListForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: TeamsListForAuthenticatedUserEndpoint,
    request: TeamsListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[TeamsListForAuthenticatedUserResponseData]
  ): ParametersTeamsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersTeamsListForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsListForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
