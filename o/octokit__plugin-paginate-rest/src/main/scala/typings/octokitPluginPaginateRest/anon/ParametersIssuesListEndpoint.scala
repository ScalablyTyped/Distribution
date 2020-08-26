package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListEndpoint
import typings.octokitTypes.endpointsMod.IssuesListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesListEndpoint extends js.Object {
  var parameters: IssuesListEndpoint = js.native
  var response: OctokitResponse[IssuesListResponseData] = js.native
}

object ParametersIssuesListEndpoint {
  @scala.inline
  def apply(parameters: IssuesListEndpoint, response: OctokitResponse[IssuesListResponseData]): ParametersIssuesListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesListEndpointOps[Self <: ParametersIssuesListEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesListEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

