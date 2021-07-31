package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListEventsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListEventsForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListEventsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListEventsForAuthenticatedUserEndpoint
  
  var request: ActivityListEventsForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityListEventsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListEventsForAuthenticatedUserEndpoint,
    request: ActivityListEventsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityListEventsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListEventsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListEventsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityListEventsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListEventsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListEventsForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
