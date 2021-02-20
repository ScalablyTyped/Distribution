package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint = js.native
  
  var request: ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[ActivityGetThreadSubscriptionForAuthenticatedUserResponseData] = js.native
}
object ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint,
    request: ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityGetThreadSubscriptionForAuthenticatedUserResponseData]
  ): ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetThreadSubscriptionForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
