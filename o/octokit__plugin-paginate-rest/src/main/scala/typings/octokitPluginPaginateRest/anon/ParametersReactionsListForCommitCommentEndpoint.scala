package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReactionsListForCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsListForCommitCommentEndpoint extends js.Object {
  var parameters: ReactionsListForCommitCommentEndpoint
  var response: OctokitResponse[ReactionsListForCommitCommentResponseData]
}

object ParametersReactionsListForCommitCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForCommitCommentEndpoint,
    response: OctokitResponse[ReactionsListForCommitCommentResponseData]
  ): ParametersReactionsListForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForCommitCommentEndpoint]
  }
}

