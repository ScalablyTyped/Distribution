package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsMoveCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsMoveCardRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsMoveCardEndpoint extends StObject {
  
  var parameters: ProjectsMoveCardEndpoint
  
  var request: ProjectsMoveCardRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersProjectsMoveCardEndpoint {
  
  inline def apply(
    parameters: ProjectsMoveCardEndpoint,
    request: ProjectsMoveCardRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersProjectsMoveCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsMoveCardEndpoint]
  }
  
  extension [Self <: ParametersProjectsMoveCardEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsMoveCardEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsMoveCardRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
