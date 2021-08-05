package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsDeletePendingReviewEndpoint extends StObject {
  
  var parameters: PullsDeletePendingReviewEndpoint
  
  var request: PullsDeletePendingReviewRequestOptions
  
  var response: OctokitResponse[PullsDeletePendingReviewResponseData]
}
object ParametersPullsDeletePendingReviewEndpoint {
  
  inline def apply(
    parameters: PullsDeletePendingReviewEndpoint,
    request: PullsDeletePendingReviewRequestOptions,
    response: OctokitResponse[PullsDeletePendingReviewResponseData]
  ): ParametersPullsDeletePendingReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDeletePendingReviewEndpoint]
  }
  
  extension [Self <: ParametersPullsDeletePendingReviewEndpoint](x: Self) {
    
    inline def setParameters(value: PullsDeletePendingReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsDeletePendingReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsDeletePendingReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
