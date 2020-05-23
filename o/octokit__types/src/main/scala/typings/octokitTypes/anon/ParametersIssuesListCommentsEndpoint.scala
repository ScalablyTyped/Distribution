package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListCommentsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListCommentsRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListCommentsEndpoint extends js.Object {
  var parameters: IssuesListCommentsEndpoint
  var request: IssuesListCommentsRequestOptions
  var response: OctokitResponse[IssuesListCommentsResponseData]
}

object ParametersIssuesListCommentsEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListCommentsEndpoint,
    request: IssuesListCommentsRequestOptions,
    response: OctokitResponse[IssuesListCommentsResponseData]
  ): ParametersIssuesListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListCommentsEndpoint]
  }
}

