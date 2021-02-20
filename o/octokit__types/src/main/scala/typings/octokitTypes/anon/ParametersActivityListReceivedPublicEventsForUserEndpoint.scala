package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListReceivedPublicEventsForUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReceivedPublicEventsForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListReceivedPublicEventsForUserEndpoint extends StObject {
  
  var parameters: ActivityListReceivedPublicEventsForUserEndpoint = js.native
  
  var request: ActivityListReceivedPublicEventsForUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityListReceivedPublicEventsForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListReceivedPublicEventsForUserEndpoint,
    request: ActivityListReceivedPublicEventsForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListReceivedPublicEventsForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReceivedPublicEventsForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListReceivedPublicEventsForUserEndpointMutableBuilder[Self <: ParametersActivityListReceivedPublicEventsForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListReceivedPublicEventsForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListReceivedPublicEventsForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
