package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsRequestReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsRequestReviewersRequestOptions
import typings.octokitTypes.endpointsMod.PullsRequestReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsRequestReviewersEndpoint extends StObject {
  
  var parameters: PullsRequestReviewersEndpoint
  
  var request: PullsRequestReviewersRequestOptions
  
  var response: OctokitResponse[PullsRequestReviewersResponseData]
}
object ParametersPullsRequestReviewersEndpoint {
  
  inline def apply(
    parameters: PullsRequestReviewersEndpoint,
    request: PullsRequestReviewersRequestOptions,
    response: OctokitResponse[PullsRequestReviewersResponseData]
  ): ParametersPullsRequestReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsRequestReviewersEndpoint]
  }
  
  extension [Self <: ParametersPullsRequestReviewersEndpoint](x: Self) {
    
    inline def setParameters(value: PullsRequestReviewersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsRequestReviewersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsRequestReviewersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
