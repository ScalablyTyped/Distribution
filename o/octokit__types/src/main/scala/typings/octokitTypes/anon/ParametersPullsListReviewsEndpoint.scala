package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListReviewsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewsRequestOptions
import typings.octokitTypes.endpointsMod.PullsListReviewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsListReviewsEndpoint extends StObject {
  
  var parameters: PullsListReviewsEndpoint
  
  var request: PullsListReviewsRequestOptions
  
  var response: OctokitResponse[PullsListReviewsResponseData]
}
object ParametersPullsListReviewsEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListReviewsEndpoint,
    request: PullsListReviewsRequestOptions,
    response: OctokitResponse[PullsListReviewsResponseData]
  ): ParametersPullsListReviewsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListReviewsEndpointMutableBuilder[Self <: ParametersPullsListReviewsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListReviewsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsListReviewsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListReviewsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
