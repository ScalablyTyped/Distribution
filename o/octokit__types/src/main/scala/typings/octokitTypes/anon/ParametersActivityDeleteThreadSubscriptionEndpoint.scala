package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityDeleteThreadSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityDeleteThreadSubscriptionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityDeleteThreadSubscriptionEndpoint extends js.Object {
  var parameters: ActivityDeleteThreadSubscriptionEndpoint
  var request: ActivityDeleteThreadSubscriptionRequestOptions
  var response: OctokitResponse[_]
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
}

