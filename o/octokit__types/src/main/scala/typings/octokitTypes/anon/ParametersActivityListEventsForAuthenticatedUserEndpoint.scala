package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListEventsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListEventsForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListEventsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityListEventsForAuthenticatedUserEndpoint
  var request: ActivityListEventsForAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityListEventsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListEventsForAuthenticatedUserEndpoint,
    request: ActivityListEventsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListEventsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListEventsForAuthenticatedUserEndpoint]
  }
}

