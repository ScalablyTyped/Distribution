package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetCommentRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesGetCommentEndpoint extends js.Object {
  var parameters: IssuesGetCommentEndpoint
  var request: IssuesGetCommentRequestOptions
  var response: OctokitResponse[IssuesGetCommentResponseData]
}

object ParametersIssuesGetCommentEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesGetCommentEndpoint,
    request: IssuesGetCommentRequestOptions,
    response: OctokitResponse[IssuesGetCommentResponseData]
  ): ParametersIssuesGetCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetCommentEndpoint]
  }
}

