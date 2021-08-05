package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsGetReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsGetReviewCommentEndpoint extends StObject {
  
  var parameters: PullsGetReviewCommentEndpoint
  
  var request: PullsGetReviewCommentRequestOptions
  
  var response: OctokitResponse[PullsGetReviewCommentResponseData]
}
object ParametersPullsGetReviewCommentEndpoint {
  
  inline def apply(
    parameters: PullsGetReviewCommentEndpoint,
    request: PullsGetReviewCommentRequestOptions,
    response: OctokitResponse[PullsGetReviewCommentResponseData]
  ): ParametersPullsGetReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetReviewCommentEndpoint]
  }
  
  extension [Self <: ParametersPullsGetReviewCommentEndpoint](x: Self) {
    
    inline def setParameters(value: PullsGetReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsGetReviewCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsGetReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
