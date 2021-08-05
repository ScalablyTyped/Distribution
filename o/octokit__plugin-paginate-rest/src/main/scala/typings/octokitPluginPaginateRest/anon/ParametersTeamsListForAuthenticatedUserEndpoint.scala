package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: TeamsListForAuthenticatedUserEndpoint
  
  var response: OctokitResponse[TeamsListForAuthenticatedUserResponseData]
}
object ParametersTeamsListForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: TeamsListForAuthenticatedUserEndpoint,
    response: OctokitResponse[TeamsListForAuthenticatedUserResponseData]
  ): ParametersTeamsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersTeamsListForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
