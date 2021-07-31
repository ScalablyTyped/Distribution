package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsGetReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsGetReviewEndpoint extends StObject {
  
  var parameters: PullsGetReviewEndpoint
  
  var request: PullsGetReviewRequestOptions
  
  var response: OctokitResponse[PullsGetReviewResponseData]
}
object ParametersPullsGetReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsGetReviewEndpoint,
    request: PullsGetReviewRequestOptions,
    response: OctokitResponse[PullsGetReviewResponseData]
  ): ParametersPullsGetReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsGetReviewEndpointMutableBuilder[Self <: ParametersPullsGetReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsGetReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsGetReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsGetReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
