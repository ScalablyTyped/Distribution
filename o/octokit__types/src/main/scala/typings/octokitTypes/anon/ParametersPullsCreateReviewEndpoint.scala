package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsCreateReviewEndpoint extends StObject {
  
  var parameters: PullsCreateReviewEndpoint
  
  var request: PullsCreateReviewRequestOptions
  
  var response: OctokitResponse[PullsCreateReviewResponseData]
}
object ParametersPullsCreateReviewEndpoint {
  
  inline def apply(
    parameters: PullsCreateReviewEndpoint,
    request: PullsCreateReviewRequestOptions,
    response: OctokitResponse[PullsCreateReviewResponseData]
  ): ParametersPullsCreateReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReviewEndpoint]
  }
  
  extension [Self <: ParametersPullsCreateReviewEndpoint](x: Self) {
    
    inline def setParameters(value: PullsCreateReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsCreateReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsCreateReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
