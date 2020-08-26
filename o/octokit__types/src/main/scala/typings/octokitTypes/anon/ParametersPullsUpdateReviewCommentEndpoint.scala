package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsUpdateReviewCommentEndpoint extends js.Object {
  var parameters: PullsUpdateReviewCommentEndpoint = js.native
  var request: PullsUpdateReviewCommentRequestOptions = js.native
  var response: OctokitResponse[PullsUpdateReviewCommentResponseData] = js.native
}

object ParametersPullsUpdateReviewCommentEndpoint {
  @scala.inline
  def apply(
    parameters: PullsUpdateReviewCommentEndpoint,
    request: PullsUpdateReviewCommentRequestOptions,
    response: OctokitResponse[PullsUpdateReviewCommentResponseData]
  ): ParametersPullsUpdateReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateReviewCommentEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsUpdateReviewCommentEndpointOps[Self <: ParametersPullsUpdateReviewCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsUpdateReviewCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: PullsUpdateReviewCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateReviewCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

