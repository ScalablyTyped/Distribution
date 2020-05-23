package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesUpdateMilestoneEndpoint extends js.Object {
  var parameters: IssuesUpdateMilestoneEndpoint
  var request: IssuesUpdateMilestoneRequestOptions
  var response: OctokitResponse[IssuesUpdateMilestoneResponseData]
}

object ParametersIssuesUpdateMilestoneEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesUpdateMilestoneEndpoint,
    request: IssuesUpdateMilestoneRequestOptions,
    response: OctokitResponse[IssuesUpdateMilestoneResponseData]
  ): ParametersIssuesUpdateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateMilestoneEndpoint]
  }
}

