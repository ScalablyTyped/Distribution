package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesDeleteCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesDeleteCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesDeleteCommentEndpoint extends js.Object {
  var parameters: IssuesDeleteCommentEndpoint
  var request: IssuesDeleteCommentRequestOptions
  var response: OctokitResponse[_]
}

object ParametersIssuesDeleteCommentEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesDeleteCommentEndpoint,
    request: IssuesDeleteCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesDeleteCommentEndpoint]
  }
}

