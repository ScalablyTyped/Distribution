package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsCreateReplyForReviewCommentEndpoint extends js.Object {
  
  var parameters: PullsCreateReplyForReviewCommentEndpoint = js.native
  
  var request: PullsCreateReplyForReviewCommentRequestOptions = js.native
  
  var response: OctokitResponse[PullsCreateReplyForReviewCommentResponseData] = js.native
}
object ParametersPullsCreateReplyForReviewCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsCreateReplyForReviewCommentEndpoint,
    request: PullsCreateReplyForReviewCommentRequestOptions,
    response: OctokitResponse[PullsCreateReplyForReviewCommentResponseData]
  ): ParametersPullsCreateReplyForReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReplyForReviewCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsCreateReplyForReviewCommentEndpointOps[Self <: ParametersPullsCreateReplyForReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsCreateReplyForReviewCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsCreateReplyForReviewCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsCreateReplyForReviewCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
