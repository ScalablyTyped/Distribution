package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionRequestOptions
import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActivitySetThreadSubscriptionEndpoint extends js.Object {
  var parameters: ActivitySetThreadSubscriptionEndpoint = js.native
  var request: ActivitySetThreadSubscriptionRequestOptions = js.native
  var response: OctokitResponse[ActivitySetThreadSubscriptionResponseData] = js.native
}

object ParametersActivitySetThreadSubscriptionEndpoint {
  @scala.inline
  def apply(
    parameters: ActivitySetThreadSubscriptionEndpoint,
    request: ActivitySetThreadSubscriptionRequestOptions,
    response: OctokitResponse[ActivitySetThreadSubscriptionResponseData]
  ): ParametersActivitySetThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivitySetThreadSubscriptionEndpoint]
  }
  @scala.inline
  implicit class ParametersActivitySetThreadSubscriptionEndpointOps[Self <: ParametersActivitySetThreadSubscriptionEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActivitySetThreadSubscriptionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActivitySetThreadSubscriptionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActivitySetThreadSubscriptionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

