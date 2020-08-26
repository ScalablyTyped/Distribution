package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForIssueCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForIssueCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReactionsListForIssueCommentEndpoint extends js.Object {
  var parameters: ReactionsListForIssueCommentEndpoint = js.native
  var request: ReactionsListForIssueCommentRequestOptions = js.native
  var response: OctokitResponse[ReactionsListForIssueCommentResponseData] = js.native
}

object ParametersReactionsListForIssueCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForIssueCommentEndpoint,
    request: ReactionsListForIssueCommentRequestOptions,
    response: OctokitResponse[ReactionsListForIssueCommentResponseData]
  ): ParametersReactionsListForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForIssueCommentEndpoint]
  }
  @scala.inline
  implicit class ParametersReactionsListForIssueCommentEndpointOps[Self <: ParametersReactionsListForIssueCommentEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: ReactionsListForIssueCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReactionsListForIssueCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForIssueCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

