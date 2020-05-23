package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsCreateForIssueEndpoint extends js.Object {
  var parameters: ReactionsCreateForIssueEndpoint
  var request: ReactionsCreateForIssueRequestOptions
  var response: OctokitResponse[ReactionsCreateForIssueResponseData]
}

object ParametersReactionsCreateForIssueEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForIssueEndpoint,
    request: ReactionsCreateForIssueRequestOptions,
    response: OctokitResponse[ReactionsCreateForIssueResponseData]
  ): ParametersReactionsCreateForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForIssueEndpoint]
  }
}

