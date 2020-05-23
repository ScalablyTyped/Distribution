package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCheckAssigneeEndpoint
import typings.octokitTypes.endpointsMod.IssuesCheckAssigneeRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesCheckAssigneeEndpoint extends js.Object {
  var parameters: IssuesCheckAssigneeEndpoint
  var request: IssuesCheckAssigneeRequestOptions
  var response: OctokitResponse[_]
}

object ParametersIssuesCheckAssigneeEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesCheckAssigneeEndpoint,
    request: IssuesCheckAssigneeRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesCheckAssigneeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCheckAssigneeEndpoint]
  }
}

