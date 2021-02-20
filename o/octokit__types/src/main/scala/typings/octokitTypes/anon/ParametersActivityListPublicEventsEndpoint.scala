package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicEventsEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicEventsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListPublicEventsEndpoint extends StObject {
  
  var parameters: ActivityListPublicEventsEndpoint = js.native
  
  var request: ActivityListPublicEventsRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityListPublicEventsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListPublicEventsEndpoint,
    request: ActivityListPublicEventsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListPublicEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicEventsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListPublicEventsEndpointMutableBuilder[Self <: ParametersActivityListPublicEventsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListPublicEventsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListPublicEventsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
