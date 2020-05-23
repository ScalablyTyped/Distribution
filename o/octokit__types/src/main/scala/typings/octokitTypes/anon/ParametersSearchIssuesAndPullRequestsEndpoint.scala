package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsEndpoint
import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsRequestOptions
import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchIssuesAndPullRequestsEndpoint extends js.Object {
  var parameters: SearchIssuesAndPullRequestsEndpoint
  var request: SearchIssuesAndPullRequestsRequestOptions
  var response: OctokitResponse[SearchIssuesAndPullRequestsResponseData]
}

object ParametersSearchIssuesAndPullRequestsEndpoint {
  @scala.inline
  def apply(
    parameters: SearchIssuesAndPullRequestsEndpoint,
    request: SearchIssuesAndPullRequestsRequestOptions,
    response: OctokitResponse[SearchIssuesAndPullRequestsResponseData]
  ): ParametersSearchIssuesAndPullRequestsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchIssuesAndPullRequestsEndpoint]
  }
}

