package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsEndpoint
import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchIssuesAndPullRequestsEndpoint extends js.Object {
  var parameters: SearchIssuesAndPullRequestsEndpoint
  var response: OctokitResponse[SearchIssuesAndPullRequestsResponseData] with `15`
}

object ParametersSearchIssuesAndPullRequestsEndpoint {
  @scala.inline
  def apply(
    parameters: SearchIssuesAndPullRequestsEndpoint,
    response: OctokitResponse[SearchIssuesAndPullRequestsResponseData] with `15`
  ): ParametersSearchIssuesAndPullRequestsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchIssuesAndPullRequestsEndpoint]
  }
}

