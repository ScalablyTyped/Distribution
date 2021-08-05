package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListNotificationsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListNotificationsForAuthenticatedUserEndpoint
  
  var request: ActivityListNotificationsForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
}
object ParametersActivityListNotificationsForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: ActivityListNotificationsForAuthenticatedUserEndpoint,
    request: ActivityListNotificationsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
  ): ParametersActivityListNotificationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListNotificationsForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersActivityListNotificationsForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListNotificationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityListNotificationsForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
