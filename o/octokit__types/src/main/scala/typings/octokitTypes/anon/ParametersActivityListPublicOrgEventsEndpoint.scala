package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicOrgEventsEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicOrgEventsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListPublicOrgEventsEndpoint extends js.Object {
  var parameters: ActivityListPublicOrgEventsEndpoint
  var request: ActivityListPublicOrgEventsRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityListPublicOrgEventsEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListPublicOrgEventsEndpoint,
    request: ActivityListPublicOrgEventsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListPublicOrgEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicOrgEventsEndpoint]
  }
}

