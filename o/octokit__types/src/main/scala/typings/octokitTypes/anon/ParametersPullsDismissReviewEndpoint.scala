package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDismissReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsDismissReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsDismissReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsDismissReviewEndpoint extends StObject {
  
  var parameters: PullsDismissReviewEndpoint
  
  var request: PullsDismissReviewRequestOptions
  
  var response: OctokitResponse[PullsDismissReviewResponseData]
}
object ParametersPullsDismissReviewEndpoint {
  
  inline def apply(
    parameters: PullsDismissReviewEndpoint,
    request: PullsDismissReviewRequestOptions,
    response: OctokitResponse[PullsDismissReviewResponseData]
  ): ParametersPullsDismissReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDismissReviewEndpoint]
  }
  
  extension [Self <: ParametersPullsDismissReviewEndpoint](x: Self) {
    
    inline def setParameters(value: PullsDismissReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsDismissReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsDismissReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
