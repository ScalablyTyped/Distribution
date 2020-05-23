package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesGetMilestoneEndpoint extends js.Object {
  var parameters: IssuesGetMilestoneEndpoint
  var request: IssuesGetMilestoneRequestOptions
  var response: OctokitResponse[IssuesGetMilestoneResponseData]
}

object ParametersIssuesGetMilestoneEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesGetMilestoneEndpoint,
    request: IssuesGetMilestoneRequestOptions,
    response: OctokitResponse[IssuesGetMilestoneResponseData]
  ): ParametersIssuesGetMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetMilestoneEndpoint]
  }
}

