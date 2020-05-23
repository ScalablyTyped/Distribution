package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListReposStarredByAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityListReposStarredByAuthenticatedUserEndpoint
  var request: ActivityListReposStarredByAuthenticatedUserRequestOptions
  var response: OctokitResponse[
    ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
  ]
}

object ParametersActivityListReposStarredByAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListReposStarredByAuthenticatedUserEndpoint,
    request: ActivityListReposStarredByAuthenticatedUserRequestOptions,
    response: OctokitResponse[
      ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
    ]
  ): ParametersActivityListReposStarredByAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposStarredByAuthenticatedUserEndpoint]
  }
}

