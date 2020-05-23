package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListReposStarredByUserEndpoint extends js.Object {
  var parameters: ActivityListReposStarredByUserEndpoint
  var response: OctokitResponse[
    ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
  ]
}

object ParametersActivityListReposStarredByUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListReposStarredByUserEndpoint,
    response: OctokitResponse[
      ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
    ]
  ): ParametersActivityListReposStarredByUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposStarredByUserEndpoint]
  }
}

