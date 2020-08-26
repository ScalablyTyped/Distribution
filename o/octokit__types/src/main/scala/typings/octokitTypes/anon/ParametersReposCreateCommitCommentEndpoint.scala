package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposCreateCommitCommentEndpoint extends js.Object {
  var parameters: ReposCreateCommitCommentEndpoint = js.native
  var request: ReposCreateCommitCommentRequestOptions = js.native
  var response: OctokitResponse[ReposCreateCommitCommentResponseData] = js.native
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
  @scala.inline
  implicit class ParametersReposCreateCommitCommentEndpointOps[Self <: ParametersReposCreateCommitCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposCreateCommitCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposCreateCommitCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

