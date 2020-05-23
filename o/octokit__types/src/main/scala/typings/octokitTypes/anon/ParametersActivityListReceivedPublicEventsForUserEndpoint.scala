package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListReceivedPublicEventsForUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReceivedPublicEventsForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListReceivedPublicEventsForUserEndpoint extends js.Object {
  var parameters: ActivityListReceivedPublicEventsForUserEndpoint
  var request: ActivityListReceivedPublicEventsForUserRequestOptions
  var response: OctokitResponse[_]
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
}

