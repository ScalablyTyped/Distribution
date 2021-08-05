package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsListCommentsForReviewEndpoint extends StObject {
  
  var parameters: PullsListCommentsForReviewEndpoint
  
  var request: PullsListCommentsForReviewRequestOptions
  
  var response: OctokitResponse[PullsListCommentsForReviewResponseData]
}
object ParametersPullsListCommentsForReviewEndpoint {
  
  inline def apply(
    parameters: PullsListCommentsForReviewEndpoint,
    request: PullsListCommentsForReviewRequestOptions,
    response: OctokitResponse[PullsListCommentsForReviewResponseData]
  ): ParametersPullsListCommentsForReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommentsForReviewEndpoint]
  }
  
  extension [Self <: ParametersPullsListCommentsForReviewEndpoint](x: Self) {
    
    inline def setParameters(value: PullsListCommentsForReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsListCommentsForReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListCommentsForReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
