package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsCreateForPullRequestReviewCommentEndpoint extends StObject {
  
  var parameters: ReactionsCreateForPullRequestReviewCommentEndpoint
  
  var request: ReactionsCreateForPullRequestReviewCommentRequestOptions
  
  var response: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]
}
object ParametersReactionsCreateForPullRequestReviewCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForPullRequestReviewCommentEndpoint,
    request: ReactionsCreateForPullRequestReviewCommentRequestOptions,
    response: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]
  ): ParametersReactionsCreateForPullRequestReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForPullRequestReviewCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForPullRequestReviewCommentEndpointMutableBuilder[Self <: ParametersReactionsCreateForPullRequestReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsCreateForPullRequestReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForPullRequestReviewCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
