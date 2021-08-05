package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsUpdateReviewEndpoint extends StObject {
  
  var parameters: PullsUpdateReviewEndpoint
  
  var request: PullsUpdateReviewRequestOptions
  
  var response: OctokitResponse[PullsUpdateReviewResponseData]
}
object ParametersPullsUpdateReviewEndpoint {
  
  inline def apply(
    parameters: PullsUpdateReviewEndpoint,
    request: PullsUpdateReviewRequestOptions,
    response: OctokitResponse[PullsUpdateReviewResponseData]
  ): ParametersPullsUpdateReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateReviewEndpoint]
  }
  
  extension [Self <: ParametersPullsUpdateReviewEndpoint](x: Self) {
    
    inline def setParameters(value: PullsUpdateReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsUpdateReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsUpdateReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
