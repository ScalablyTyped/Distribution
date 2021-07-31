package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsUpdateReviewCommentEndpoint extends StObject {
  
  var parameters: PullsUpdateReviewCommentEndpoint
  
  var request: PullsUpdateReviewCommentRequestOptions
  
  var response: OctokitResponse[PullsUpdateReviewCommentResponseData]
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
  implicit class ParametersPullsUpdateReviewCommentEndpointMutableBuilder[Self <: ParametersPullsUpdateReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsUpdateReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsUpdateReviewCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
