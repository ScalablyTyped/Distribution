package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateCommitCommentEndpoint extends js.Object {
  var parameters: ReposCreateCommitCommentEndpoint
  var request: ReposCreateCommitCommentRequestOptions
  var response: OctokitResponse[ReposCreateCommitCommentResponseData]
}

object ParametersReposCreateCommitCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateCommitCommentEndpoint,
    request: ReposCreateCommitCommentRequestOptions,
    response: OctokitResponse[ReposCreateCommitCommentResponseData]
  ): ParametersReposCreateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateCommitCommentEndpoint]
  }
}

