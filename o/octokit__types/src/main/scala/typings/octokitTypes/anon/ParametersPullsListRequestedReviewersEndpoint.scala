package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersRequestOptions
import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsListRequestedReviewersEndpoint extends StObject {
  
  var parameters: PullsListRequestedReviewersEndpoint
  
  var request: PullsListRequestedReviewersRequestOptions
  
  var response: OctokitResponse[PullsListRequestedReviewersResponseData]
}
object ParametersPullsListRequestedReviewersEndpoint {
  
  inline def apply(
    parameters: PullsListRequestedReviewersEndpoint,
    request: PullsListRequestedReviewersRequestOptions,
    response: OctokitResponse[PullsListRequestedReviewersResponseData]
  ): ParametersPullsListRequestedReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListRequestedReviewersEndpoint]
  }
  
  extension [Self <: ParametersPullsListRequestedReviewersEndpoint](x: Self) {
    
    inline def setParameters(value: PullsListRequestedReviewersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsListRequestedReviewersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListRequestedReviewersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
