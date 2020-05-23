package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForIssueRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsDeleteForIssueEndpoint extends js.Object {
  var parameters: ReactionsDeleteForIssueEndpoint
  var request: ReactionsDeleteForIssueRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReactionsDeleteForIssueEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForIssueEndpoint,
    request: ReactionsDeleteForIssueRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForIssueEndpoint]
  }
}

