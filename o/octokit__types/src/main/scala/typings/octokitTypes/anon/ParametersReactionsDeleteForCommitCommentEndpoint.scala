package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForCommitCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsDeleteForCommitCommentEndpoint extends js.Object {
  var parameters: ReactionsDeleteForCommitCommentEndpoint
  var request: ReactionsDeleteForCommitCommentRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReactionsDeleteForCommitCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForCommitCommentEndpoint,
    request: ReactionsDeleteForCommitCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForCommitCommentEndpoint]
  }
}

