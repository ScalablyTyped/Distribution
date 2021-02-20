package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.RateLimitGetEndpoint
import typings.octokitTypes.endpointsMod.RateLimitGetRequestOptions
import typings.octokitTypes.endpointsMod.RateLimitGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersRateLimitGetEndpoint extends StObject {
  
  var parameters: RateLimitGetEndpoint = js.native
  
  var request: RateLimitGetRequestOptions = js.native
  
  var response: OctokitResponse[RateLimitGetResponseData] = js.native
}
object ParametersRateLimitGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: RateLimitGetEndpoint,
    request: RateLimitGetRequestOptions,
    response: OctokitResponse[RateLimitGetResponseData]
  ): ParametersRateLimitGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRateLimitGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersRateLimitGetEndpointMutableBuilder[Self <: ParametersRateLimitGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RateLimitGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RateLimitGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[RateLimitGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
