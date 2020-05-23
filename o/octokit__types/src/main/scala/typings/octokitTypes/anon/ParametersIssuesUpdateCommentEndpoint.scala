package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateCommentRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesUpdateCommentEndpoint extends js.Object {
  var parameters: IssuesUpdateCommentEndpoint
  var request: IssuesUpdateCommentRequestOptions
  var response: OctokitResponse[IssuesUpdateCommentResponseData]
}

object ParametersIssuesUpdateCommentEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesUpdateCommentEndpoint,
    request: IssuesUpdateCommentRequestOptions,
    response: OctokitResponse[IssuesUpdateCommentResponseData]
  ): ParametersIssuesUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateCommentEndpoint]
  }
}

