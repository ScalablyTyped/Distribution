package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesListLabelsForRepoEndpoint extends js.Object {
  var parameters: IssuesListLabelsForRepoEndpoint = js.native
  var request: IssuesListLabelsForRepoRequestOptions = js.native
  var response: OctokitResponse[IssuesListLabelsForRepoResponseData] = js.native
}

object ParametersIssuesListLabelsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListLabelsForRepoEndpoint,
    request: IssuesListLabelsForRepoRequestOptions,
    response: OctokitResponse[IssuesListLabelsForRepoResponseData]
  ): ParametersIssuesListLabelsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListLabelsForRepoEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesListLabelsForRepoEndpointOps[Self <: ParametersIssuesListLabelsForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesListLabelsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IssuesListLabelsForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListLabelsForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

