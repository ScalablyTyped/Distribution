package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReactionsCreateForCommitCommentEndpoint extends js.Object {
  var parameters: ReactionsCreateForCommitCommentEndpoint = js.native
  var request: ReactionsCreateForCommitCommentRequestOptions = js.native
  var response: OctokitResponse[ReactionsCreateForCommitCommentResponseData] = js.native
}

object ParametersReactionsCreateForCommitCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForCommitCommentEndpoint,
    request: ReactionsCreateForCommitCommentRequestOptions,
    response: OctokitResponse[ReactionsCreateForCommitCommentResponseData]
  ): ParametersReactionsCreateForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForCommitCommentEndpoint]
  }
  @scala.inline
  implicit class ParametersReactionsCreateForCommitCommentEndpointOps[Self <: ParametersReactionsCreateForCommitCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReactionsCreateForCommitCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReactionsCreateForCommitCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForCommitCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

