package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListReceivedEventsForUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReceivedEventsForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListReceivedEventsForUserEndpoint extends StObject {
  
  var parameters: ActivityListReceivedEventsForUserEndpoint = js.native
  
  var request: ActivityListReceivedEventsForUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityListReceivedEventsForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListReceivedEventsForUserEndpoint,
    request: ActivityListReceivedEventsForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListReceivedEventsForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReceivedEventsForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListReceivedEventsForUserEndpointMutableBuilder[Self <: ParametersActivityListReceivedEventsForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListReceivedEventsForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListReceivedEventsForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
