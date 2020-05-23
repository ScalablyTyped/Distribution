package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListWatchedReposForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint
  var request: ActivityListWatchedReposForAuthenticatedUserRequestOptions
  var response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
}

object ParametersActivityListWatchedReposForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint,
    request: ActivityListWatchedReposForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
  ): ParametersActivityListWatchedReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListWatchedReposForAuthenticatedUserEndpoint]
  }
}

