package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposAddStatusCheckContextsEndpoint extends StObject {
  
  var parameters: ReposAddStatusCheckContextsEndpoint
  
  var request: ReposAddStatusCheckContextsRequestOptions
  
  var response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
}
object ParametersReposAddStatusCheckContextsEndpoint {
  
  inline def apply(
    parameters: ReposAddStatusCheckContextsEndpoint,
    request: ReposAddStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
  ): ParametersReposAddStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddStatusCheckContextsEndpoint]
  }
  
  extension [Self <: ParametersReposAddStatusCheckContextsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposAddStatusCheckContextsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposAddStatusCheckContextsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposAddStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
