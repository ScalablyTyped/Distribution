package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesListCommentsForRepoEndpoint extends js.Object {
  var parameters: IssuesListCommentsForRepoEndpoint = js.native
  var request: IssuesListCommentsForRepoRequestOptions = js.native
  var response: OctokitResponse[IssuesListCommentsForRepoResponseData] = js.native
}

object ParametersIssuesListCommentsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListCommentsForRepoEndpoint,
    request: IssuesListCommentsForRepoRequestOptions,
    response: OctokitResponse[IssuesListCommentsForRepoResponseData]
  ): ParametersIssuesListCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListCommentsForRepoEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesListCommentsForRepoEndpointOps[Self <: ParametersIssuesListCommentsForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesListCommentsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IssuesListCommentsForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListCommentsForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

