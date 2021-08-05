package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint
  
  var request: ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[ActivityGetThreadSubscriptionForAuthenticatedUserResponseData]
}
object ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint,
    request: ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityGetThreadSubscriptionForAuthenticatedUserResponseData]
  ): ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityGetThreadSubscriptionForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
