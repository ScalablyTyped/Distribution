package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesDeleteCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesDeleteCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesDeleteCommentEndpoint extends js.Object {
  var parameters: IssuesDeleteCommentEndpoint = js.native
  var request: IssuesDeleteCommentRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersIssuesDeleteCommentEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesDeleteCommentEndpoint,
    request: IssuesDeleteCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesDeleteCommentEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesDeleteCommentEndpointOps[Self <: ParametersIssuesDeleteCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesDeleteCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IssuesDeleteCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

