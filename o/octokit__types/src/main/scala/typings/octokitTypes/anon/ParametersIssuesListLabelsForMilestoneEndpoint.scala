package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListLabelsForMilestoneEndpoint extends js.Object {
  var parameters: IssuesListLabelsForMilestoneEndpoint
  var request: IssuesListLabelsForMilestoneRequestOptions
  var response: OctokitResponse[IssuesListLabelsForMilestoneResponseData]
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
}

