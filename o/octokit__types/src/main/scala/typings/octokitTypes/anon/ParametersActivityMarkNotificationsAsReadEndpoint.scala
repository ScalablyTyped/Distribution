package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityMarkNotificationsAsReadEndpoint
import typings.octokitTypes.endpointsMod.ActivityMarkNotificationsAsReadRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityMarkNotificationsAsReadEndpoint extends StObject {
  
  var parameters: ActivityMarkNotificationsAsReadEndpoint
  
  var request: ActivityMarkNotificationsAsReadRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityMarkNotificationsAsReadEndpoint {
  
  inline def apply(
    parameters: ActivityMarkNotificationsAsReadEndpoint,
    request: ActivityMarkNotificationsAsReadRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityMarkNotificationsAsReadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityMarkNotificationsAsReadEndpoint]
  }
  
  extension [Self <: ParametersActivityMarkNotificationsAsReadEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityMarkNotificationsAsReadEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityMarkNotificationsAsReadRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
