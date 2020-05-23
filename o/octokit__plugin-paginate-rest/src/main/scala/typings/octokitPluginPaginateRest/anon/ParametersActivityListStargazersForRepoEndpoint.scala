package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListStargazersForRepoEndpoint extends js.Object {
  var parameters: ActivityListStargazersForRepoEndpoint
  var response: OctokitResponse[
    ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
  ]
}

object ParametersActivityListStargazersForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListStargazersForRepoEndpoint,
    response: OctokitResponse[
      ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
    ]
  ): ParametersActivityListStargazersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListStargazersForRepoEndpoint]
  }
}

