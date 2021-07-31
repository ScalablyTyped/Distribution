package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsCreateReplyForReviewCommentEndpoint extends StObject {
  
  var parameters: PullsCreateReplyForReviewCommentEndpoint
  
  var request: PullsCreateReplyForReviewCommentRequestOptions
  
  var response: OctokitResponse[PullsCreateReplyForReviewCommentResponseData]
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
  implicit class ParametersPullsCreateReplyForReviewCommentEndpointMutableBuilder[Self <: ParametersPullsCreateReplyForReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsCreateReplyForReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsCreateReplyForReviewCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsCreateReplyForReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
