package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityListRepoNotificationsForAuthenticatedUserEndpoint
  var request: ActivityListRepoNotificationsForAuthenticatedUserRequestOptions
  var response: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData]
}

object ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListRepoNotificationsForAuthenticatedUserEndpoint,
    request: ActivityListRepoNotificationsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData]
  ): ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint]
  }
}

