package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint extends js.Object {
  
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
  implicit class ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpointOps[Self <: ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetThreadSubscriptionForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
