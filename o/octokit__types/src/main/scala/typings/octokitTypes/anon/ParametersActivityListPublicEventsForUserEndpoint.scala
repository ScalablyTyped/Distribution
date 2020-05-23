package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListPublicEventsForUserEndpoint extends js.Object {
  var parameters: ActivityListPublicEventsForUserEndpoint
  var request: ActivityListPublicEventsForUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityListPublicEventsForUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListPublicEventsForUserEndpoint,
    request: ActivityListPublicEventsForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListPublicEventsForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicEventsForUserEndpoint]
  }
}

