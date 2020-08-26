package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesListLabelsForMilestoneEndpoint extends js.Object {
  var parameters: IssuesListLabelsForMilestoneEndpoint = js.native
  var request: IssuesListLabelsForMilestoneRequestOptions = js.native
  var response: OctokitResponse[IssuesListLabelsForMilestoneResponseData] = js.native
}

object ParametersIssuesListLabelsForMilestoneEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListLabelsForMilestoneEndpoint,
    request: IssuesListLabelsForMilestoneRequestOptions,
    response: OctokitResponse[IssuesListLabelsForMilestoneResponseData]
  ): ParametersIssuesListLabelsForMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListLabelsForMilestoneEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesListLabelsForMilestoneEndpointOps[Self <: ParametersIssuesListLabelsForMilestoneEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesListLabelsForMilestoneEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IssuesListLabelsForMilestoneRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListLabelsForMilestoneResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

