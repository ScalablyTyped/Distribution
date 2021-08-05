package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsCreateReviewCommentEndpoint extends StObject {
  
  var parameters: PullsCreateReviewCommentEndpoint
  
  var request: PullsCreateReviewCommentRequestOptions
  
  var response: OctokitResponse[PullsCreateReviewCommentResponseData]
}
object ParametersPullsCreateReviewCommentEndpoint {
  
  inline def apply(
    parameters: PullsCreateReviewCommentEndpoint,
    request: PullsCreateReviewCommentRequestOptions,
    response: OctokitResponse[PullsCreateReviewCommentResponseData]
  ): ParametersPullsCreateReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReviewCommentEndpoint]
  }
  
  extension [Self <: ParametersPullsCreateReviewCommentEndpoint](x: Self) {
    
    inline def setParameters(value: PullsCreateReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsCreateReviewCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsCreateReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
