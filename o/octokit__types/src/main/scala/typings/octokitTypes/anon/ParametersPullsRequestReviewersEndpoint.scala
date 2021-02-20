package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsRequestReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsRequestReviewersRequestOptions
import typings.octokitTypes.endpointsMod.PullsRequestReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsRequestReviewersEndpoint extends StObject {
  
  var parameters: PullsRequestReviewersEndpoint = js.native
  
  var request: PullsRequestReviewersRequestOptions = js.native
  
  var response: OctokitResponse[PullsRequestReviewersResponseData] = js.native
}
object ParametersPullsRequestReviewersEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsRequestReviewersEndpoint,
    request: PullsRequestReviewersRequestOptions,
    response: OctokitResponse[PullsRequestReviewersResponseData]
  ): ParametersPullsRequestReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsRequestReviewersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsRequestReviewersEndpointMutableBuilder[Self <: ParametersPullsRequestReviewersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsRequestReviewersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsRequestReviewersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsRequestReviewersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
