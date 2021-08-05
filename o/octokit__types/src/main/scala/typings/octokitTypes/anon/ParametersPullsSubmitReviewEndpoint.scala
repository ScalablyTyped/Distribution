package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsSubmitReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsSubmitReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsSubmitReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsSubmitReviewEndpoint extends StObject {
  
  var parameters: PullsSubmitReviewEndpoint
  
  var request: PullsSubmitReviewRequestOptions
  
  var response: OctokitResponse[PullsSubmitReviewResponseData]
}
object ParametersPullsSubmitReviewEndpoint {
  
  inline def apply(
    parameters: PullsSubmitReviewEndpoint,
    request: PullsSubmitReviewRequestOptions,
    response: OctokitResponse[PullsSubmitReviewResponseData]
  ): ParametersPullsSubmitReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsSubmitReviewEndpoint]
  }
  
  extension [Self <: ParametersPullsSubmitReviewEndpoint](x: Self) {
    
    inline def setParameters(value: PullsSubmitReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsSubmitReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsSubmitReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
