package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListEventsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesListEventsEndpoint extends js.Object {
  var parameters: IssuesListEventsEndpoint = js.native
  var response: OctokitResponse[IssuesListEventsResponseData] = js.native
}

object ParametersIssuesListEventsEndpoint {
  @scala.inline
  def apply(parameters: IssuesListEventsEndpoint, response: OctokitResponse[IssuesListEventsResponseData]): ParametersIssuesListEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesListEventsEndpointOps[Self <: ParametersIssuesListEventsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesListEventsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListEventsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

