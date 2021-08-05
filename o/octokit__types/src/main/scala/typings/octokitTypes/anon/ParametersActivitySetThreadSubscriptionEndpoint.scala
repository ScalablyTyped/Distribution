package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionRequestOptions
import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivitySetThreadSubscriptionEndpoint extends StObject {
  
  var parameters: ActivitySetThreadSubscriptionEndpoint
  
  var request: ActivitySetThreadSubscriptionRequestOptions
  
  var response: OctokitResponse[ActivitySetThreadSubscriptionResponseData]
}
object ParametersActivitySetThreadSubscriptionEndpoint {
  
  inline def apply(
    parameters: ActivitySetThreadSubscriptionEndpoint,
    request: ActivitySetThreadSubscriptionRequestOptions,
    response: OctokitResponse[ActivitySetThreadSubscriptionResponseData]
  ): ParametersActivitySetThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivitySetThreadSubscriptionEndpoint]
  }
  
  extension [Self <: ParametersActivitySetThreadSubscriptionEndpoint](x: Self) {
    
    inline def setParameters(value: ActivitySetThreadSubscriptionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivitySetThreadSubscriptionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivitySetThreadSubscriptionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
