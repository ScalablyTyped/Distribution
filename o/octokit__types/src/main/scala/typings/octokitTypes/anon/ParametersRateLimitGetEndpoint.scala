package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.RateLimitGetEndpoint
import typings.octokitTypes.endpointsMod.RateLimitGetRequestOptions
import typings.octokitTypes.endpointsMod.RateLimitGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersRateLimitGetEndpoint extends StObject {
  
  var parameters: RateLimitGetEndpoint
  
  var request: RateLimitGetRequestOptions
  
  var response: OctokitResponse[RateLimitGetResponseData]
}
object ParametersRateLimitGetEndpoint {
  
  inline def apply(
    parameters: RateLimitGetEndpoint,
    request: RateLimitGetRequestOptions,
    response: OctokitResponse[RateLimitGetResponseData]
  ): ParametersRateLimitGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRateLimitGetEndpoint]
  }
  
  extension [Self <: ParametersRateLimitGetEndpoint](x: Self) {
    
    inline def setParameters(value: RateLimitGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RateLimitGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[RateLimitGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
