package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityDeleteThreadSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityDeleteThreadSubscriptionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityDeleteThreadSubscriptionEndpoint extends StObject {
  
  var parameters: ActivityDeleteThreadSubscriptionEndpoint = js.native
  
  var request: ActivityDeleteThreadSubscriptionRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityDeleteThreadSubscriptionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityDeleteThreadSubscriptionEndpoint,
    request: ActivityDeleteThreadSubscriptionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityDeleteThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityDeleteThreadSubscriptionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityDeleteThreadSubscriptionEndpointMutableBuilder[Self <: ParametersActivityDeleteThreadSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityDeleteThreadSubscriptionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityDeleteThreadSubscriptionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
