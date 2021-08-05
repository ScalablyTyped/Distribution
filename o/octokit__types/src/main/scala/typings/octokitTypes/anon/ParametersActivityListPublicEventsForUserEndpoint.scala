package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListPublicEventsForUserEndpoint extends StObject {
  
  var parameters: ActivityListPublicEventsForUserEndpoint
  
  var request: ActivityListPublicEventsForUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityListPublicEventsForUserEndpoint {
  
  inline def apply(
    parameters: ActivityListPublicEventsForUserEndpoint,
    request: ActivityListPublicEventsForUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityListPublicEventsForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicEventsForUserEndpoint]
  }
  
  extension [Self <: ParametersActivityListPublicEventsForUserEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListPublicEventsForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityListPublicEventsForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
