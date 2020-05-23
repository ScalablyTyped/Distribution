package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteCommitCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteCommitCommentEndpoint extends js.Object {
  var parameters: ReposDeleteCommitCommentEndpoint
  var request: ReposDeleteCommitCommentRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteCommitCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteCommitCommentEndpoint,
    request: ReposDeleteCommitCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteCommitCommentEndpoint]
  }
}

