package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsEndpoint
import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsRequestOptions
import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersSearchIssuesAndPullRequestsEndpoint extends js.Object {
  var parameters: SearchIssuesAndPullRequestsEndpoint = js.native
  var request: SearchIssuesAndPullRequestsRequestOptions = js.native
  var response: OctokitResponse[SearchIssuesAndPullRequestsResponseData] = js.native
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
  @scala.inline
  implicit class ParametersSearchIssuesAndPullRequestsEndpointOps[Self <: ParametersSearchIssuesAndPullRequestsEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: SearchIssuesAndPullRequestsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: SearchIssuesAndPullRequestsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[SearchIssuesAndPullRequestsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

