package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetByNameEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetByNameRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetByNameResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsGetByNameEndpoint extends StObject {
  
  var parameters: TeamsGetByNameEndpoint
  
  var request: TeamsGetByNameRequestOptions
  
  var response: OctokitResponse[TeamsGetByNameResponseData]
}
object ParametersTeamsGetByNameEndpoint {
  
  inline def apply(
    parameters: TeamsGetByNameEndpoint,
    request: TeamsGetByNameRequestOptions,
    response: OctokitResponse[TeamsGetByNameResponseData]
  ): ParametersTeamsGetByNameEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetByNameEndpoint]
  }
  
  extension [Self <: ParametersTeamsGetByNameEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsGetByNameEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsGetByNameRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsGetByNameResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
