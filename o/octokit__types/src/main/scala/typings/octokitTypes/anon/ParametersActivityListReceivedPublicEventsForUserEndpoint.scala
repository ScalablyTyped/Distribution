package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListReceivedPublicEventsForUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReceivedPublicEventsForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListReceivedPublicEventsForUserEndpoint extends StObject {
  
  var parameters: ActivityListReceivedPublicEventsForUserEndpoint
  
  var request: ActivityListReceivedPublicEventsForUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityListReceivedPublicEventsForUserEndpoint {
  
  inline def apply(
    parameters: ActivityListReceivedPublicEventsForUserEndpoint,
    request: ActivityListReceivedPublicEventsForUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityListReceivedPublicEventsForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReceivedPublicEventsForUserEndpoint]
  }
  
  extension [Self <: ParametersActivityListReceivedPublicEventsForUserEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListReceivedPublicEventsForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityListReceivedPublicEventsForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
