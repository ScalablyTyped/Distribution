package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionRequestOptions
import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivitySetThreadSubscriptionEndpoint extends js.Object {
  var parameters: ActivitySetThreadSubscriptionEndpoint
  var request: ActivitySetThreadSubscriptionRequestOptions
  var response: OctokitResponse[ActivitySetThreadSubscriptionResponseData]
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
}

