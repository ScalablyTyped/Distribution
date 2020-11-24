package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityDeleteThreadSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityDeleteThreadSubscriptionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityDeleteThreadSubscriptionEndpoint extends js.Object {
  
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
  implicit class ParametersActivityDeleteThreadSubscriptionEndpointOps[Self <: ParametersActivityDeleteThreadSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActivityDeleteThreadSubscriptionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityDeleteThreadSubscriptionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
