package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCreateCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateCommentRequestOptions
import typings.octokitTypes.endpointsMod.IssuesCreateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesCreateCommentEndpoint extends js.Object {
  var parameters: IssuesCreateCommentEndpoint
  var request: IssuesCreateCommentRequestOptions
  var response: OctokitResponse[IssuesCreateCommentResponseData]
}

object ParametersIssuesCreateCommentEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesCreateCommentEndpoint,
    request: IssuesCreateCommentRequestOptions,
    response: OctokitResponse[IssuesCreateCommentResponseData]
  ): ParametersIssuesCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateCommentEndpoint]
  }
}

