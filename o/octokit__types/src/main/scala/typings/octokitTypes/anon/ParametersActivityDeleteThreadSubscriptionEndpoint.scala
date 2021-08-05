package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityDeleteThreadSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityDeleteThreadSubscriptionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityDeleteThreadSubscriptionEndpoint extends StObject {
  
  var parameters: ActivityDeleteThreadSubscriptionEndpoint
  
  var request: ActivityDeleteThreadSubscriptionRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityDeleteThreadSubscriptionEndpoint {
  
  inline def apply(
    parameters: ActivityDeleteThreadSubscriptionEndpoint,
    request: ActivityDeleteThreadSubscriptionRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityDeleteThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityDeleteThreadSubscriptionEndpoint]
  }
  
  extension [Self <: ParametersActivityDeleteThreadSubscriptionEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityDeleteThreadSubscriptionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityDeleteThreadSubscriptionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
