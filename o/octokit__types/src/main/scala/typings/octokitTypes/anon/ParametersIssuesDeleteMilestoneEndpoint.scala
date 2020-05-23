package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesDeleteMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesDeleteMilestoneRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesDeleteMilestoneEndpoint extends js.Object {
  var parameters: IssuesDeleteMilestoneEndpoint
  var request: IssuesDeleteMilestoneRequestOptions
  var response: OctokitResponse[_]
}

object ParametersIssuesDeleteMilestoneEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesDeleteMilestoneEndpoint,
    request: IssuesDeleteMilestoneRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesDeleteMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesDeleteMilestoneEndpoint]
  }
}

