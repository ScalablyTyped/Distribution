package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListRepoEventsEndpoint
import typings.octokitTypes.endpointsMod.ActivityListRepoEventsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListRepoEventsEndpoint extends js.Object {
  var parameters: ActivityListRepoEventsEndpoint
  var request: ActivityListRepoEventsRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityListRepoEventsEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListRepoEventsEndpoint,
    request: ActivityListRepoEventsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListRepoEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListRepoEventsEndpoint]
  }
}

