package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateCommentRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesUpdateCommentEndpoint extends js.Object {
  var parameters: IssuesUpdateCommentEndpoint = js.native
  var request: IssuesUpdateCommentRequestOptions = js.native
  var response: OctokitResponse[IssuesUpdateCommentResponseData] = js.native
}

object ParametersIssuesUpdateCommentEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesUpdateCommentEndpoint,
    request: IssuesUpdateCommentRequestOptions,
    response: OctokitResponse[IssuesUpdateCommentResponseData]
  ): ParametersIssuesUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateCommentEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesUpdateCommentEndpointOps[Self <: ParametersIssuesUpdateCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesUpdateCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IssuesUpdateCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

