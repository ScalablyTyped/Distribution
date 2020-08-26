package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForPullRequestCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForPullRequestCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReactionsDeleteForPullRequestCommentEndpoint extends js.Object {
  var parameters: ReactionsDeleteForPullRequestCommentEndpoint = js.native
  var request: ReactionsDeleteForPullRequestCommentRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersReactionsDeleteForPullRequestCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForPullRequestCommentEndpoint,
    request: ReactionsDeleteForPullRequestCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForPullRequestCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForPullRequestCommentEndpoint]
  }
  @scala.inline
  implicit class ParametersReactionsDeleteForPullRequestCommentEndpointOps[Self <: ParametersReactionsDeleteForPullRequestCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReactionsDeleteForPullRequestCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReactionsDeleteForPullRequestCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

