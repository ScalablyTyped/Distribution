package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListReceivedEventsForUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReceivedEventsForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListReceivedEventsForUserEndpoint extends js.Object {
  var parameters: ActivityListReceivedEventsForUserEndpoint
  var request: ActivityListReceivedEventsForUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityListReceivedEventsForUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListReceivedEventsForUserEndpoint,
    request: ActivityListReceivedEventsForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListReceivedEventsForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReceivedEventsForUserEndpoint]
  }
}

