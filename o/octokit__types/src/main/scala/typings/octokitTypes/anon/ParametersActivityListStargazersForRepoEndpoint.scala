package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListStargazersForRepoEndpoint extends js.Object {
  var parameters: ActivityListStargazersForRepoEndpoint
  var request: ActivityListStargazersForRepoRequestOptions
  var response: OctokitResponse[
    ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
  ]
}

object ParametersActivityListStargazersForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListStargazersForRepoEndpoint,
    request: ActivityListStargazersForRepoRequestOptions,
    response: OctokitResponse[
      ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
    ]
  ): ParametersActivityListStargazersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListStargazersForRepoEndpoint]
  }
}

