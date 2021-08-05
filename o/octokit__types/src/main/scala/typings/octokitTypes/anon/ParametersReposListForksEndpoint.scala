package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListForksEndpoint
import typings.octokitTypes.endpointsMod.ReposListForksRequestOptions
import typings.octokitTypes.endpointsMod.ReposListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListForksEndpoint extends StObject {
  
  var parameters: ReposListForksEndpoint
  
  var request: ReposListForksRequestOptions
  
  var response: OctokitResponse[ReposListForksResponseData]
}
object ParametersReposListForksEndpoint {
  
  inline def apply(
    parameters: ReposListForksEndpoint,
    request: ReposListForksRequestOptions,
    response: OctokitResponse[ReposListForksResponseData]
  ): ParametersReposListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForksEndpoint]
  }
  
  extension [Self <: ParametersReposListForksEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListForksEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListForksRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListForksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
