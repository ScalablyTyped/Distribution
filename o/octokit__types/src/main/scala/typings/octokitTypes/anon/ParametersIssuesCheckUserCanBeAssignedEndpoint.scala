package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCheckUserCanBeAssignedEndpoint
import typings.octokitTypes.endpointsMod.IssuesCheckUserCanBeAssignedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesCheckUserCanBeAssignedEndpoint extends js.Object {
  var parameters: IssuesCheckUserCanBeAssignedEndpoint
  var request: IssuesCheckUserCanBeAssignedRequestOptions
  var response: OctokitResponse[_]
}

object ParametersIssuesCheckUserCanBeAssignedEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesCheckUserCanBeAssignedEndpoint,
    request: IssuesCheckUserCanBeAssignedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesCheckUserCanBeAssignedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCheckUserCanBeAssignedEndpoint]
  }
}

