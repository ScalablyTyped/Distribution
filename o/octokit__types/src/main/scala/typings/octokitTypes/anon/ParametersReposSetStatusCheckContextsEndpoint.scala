package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposSetStatusCheckContextsEndpoint extends StObject {
  
  var parameters: ReposSetStatusCheckContextsEndpoint
  
  var request: ReposSetStatusCheckContextsRequestOptions
  
  var response: OctokitResponse[ReposSetStatusCheckContextsResponseData]
}
object ParametersReposSetStatusCheckContextsEndpoint {
  
  inline def apply(
    parameters: ReposSetStatusCheckContextsEndpoint,
    request: ReposSetStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposSetStatusCheckContextsResponseData]
  ): ParametersReposSetStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetStatusCheckContextsEndpoint]
  }
  
  extension [Self <: ParametersReposSetStatusCheckContextsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposSetStatusCheckContextsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposSetStatusCheckContextsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposSetStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
