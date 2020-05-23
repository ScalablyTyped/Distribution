package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListNotificationsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityListNotificationsForAuthenticatedUserEndpoint
  var response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
}

object ParametersActivityListNotificationsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListNotificationsForAuthenticatedUserEndpoint,
    response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
  ): ParametersActivityListNotificationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListNotificationsForAuthenticatedUserEndpoint]
  }
}

