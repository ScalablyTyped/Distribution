package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitRequestOptions
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListPullRequestsAssociatedWithCommitEndpoint extends js.Object {
  var parameters: ReposListPullRequestsAssociatedWithCommitEndpoint = js.native
  var request: ReposListPullRequestsAssociatedWithCommitRequestOptions = js.native
  var response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData] = js.native
}

object ParametersReposListPullRequestsAssociatedWithCommitEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListPullRequestsAssociatedWithCommitEndpoint,
    request: ReposListPullRequestsAssociatedWithCommitRequestOptions,
    response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
  ): ParametersReposListPullRequestsAssociatedWithCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPullRequestsAssociatedWithCommitEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListPullRequestsAssociatedWithCommitEndpointOps[Self <: ParametersReposListPullRequestsAssociatedWithCommitEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListPullRequestsAssociatedWithCommitEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposListPullRequestsAssociatedWithCommitRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

