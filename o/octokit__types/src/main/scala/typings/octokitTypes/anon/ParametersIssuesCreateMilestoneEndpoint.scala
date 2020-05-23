package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesCreateMilestoneEndpoint extends js.Object {
  var parameters: IssuesCreateMilestoneEndpoint
  var request: IssuesCreateMilestoneRequestOptions
  var response: OctokitResponse[IssuesCreateMilestoneResponseData]
}

object ParametersIssuesCreateMilestoneEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesCreateMilestoneEndpoint,
    request: IssuesCreateMilestoneRequestOptions,
    response: OctokitResponse[IssuesCreateMilestoneResponseData]
  ): ParametersIssuesCreateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateMilestoneEndpoint]
  }
}

