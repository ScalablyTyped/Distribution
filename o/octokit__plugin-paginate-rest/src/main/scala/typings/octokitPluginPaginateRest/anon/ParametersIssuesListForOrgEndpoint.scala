package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListForOrgEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesListForOrgEndpoint extends js.Object {
  var parameters: IssuesListForOrgEndpoint = js.native
  var response: OctokitResponse[IssuesListForOrgResponseData] = js.native
}

object ParametersIssuesListForOrgEndpoint {
  @scala.inline
  def apply(parameters: IssuesListForOrgEndpoint, response: OctokitResponse[IssuesListForOrgResponseData]): ParametersIssuesListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesListForOrgEndpointOps[Self <: ParametersIssuesListForOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesListForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

