package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDeleteReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsDeleteReviewCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsDeleteReviewCommentEndpoint extends StObject {
  
  var parameters: PullsDeleteReviewCommentEndpoint
  
  var request: PullsDeleteReviewCommentRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersPullsDeleteReviewCommentEndpoint {
  
  inline def apply(
    parameters: PullsDeleteReviewCommentEndpoint,
    request: PullsDeleteReviewCommentRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersPullsDeleteReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDeleteReviewCommentEndpoint]
  }
  
  extension [Self <: ParametersPullsDeleteReviewCommentEndpoint](x: Self) {
    
    inline def setParameters(value: PullsDeleteReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsDeleteReviewCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
