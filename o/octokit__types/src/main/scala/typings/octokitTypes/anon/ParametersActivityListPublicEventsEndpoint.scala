package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicEventsEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicEventsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListPublicEventsEndpoint extends js.Object {
  var parameters: ActivityListPublicEventsEndpoint
  var request: ActivityListPublicEventsRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityListPublicEventsEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListPublicEventsEndpoint,
    request: ActivityListPublicEventsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListPublicEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicEventsEndpoint]
  }
}

