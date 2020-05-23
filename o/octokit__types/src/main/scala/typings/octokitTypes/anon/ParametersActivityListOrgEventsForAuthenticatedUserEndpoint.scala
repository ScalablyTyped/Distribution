package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListOrgEventsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListOrgEventsForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListOrgEventsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityListOrgEventsForAuthenticatedUserEndpoint
  var request: ActivityListOrgEventsForAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityListOrgEventsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListOrgEventsForAuthenticatedUserEndpoint,
    request: ActivityListOrgEventsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListOrgEventsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListOrgEventsForAuthenticatedUserEndpoint]
  }
}

