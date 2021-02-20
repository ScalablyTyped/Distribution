package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsSubmitReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsSubmitReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsSubmitReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsSubmitReviewEndpoint extends StObject {
  
  var parameters: PullsSubmitReviewEndpoint = js.native
  
  var request: PullsSubmitReviewRequestOptions = js.native
  
  var response: OctokitResponse[PullsSubmitReviewResponseData] = js.native
}
object ParametersPullsSubmitReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsSubmitReviewEndpoint,
    request: PullsSubmitReviewRequestOptions,
    response: OctokitResponse[PullsSubmitReviewResponseData]
  ): ParametersPullsSubmitReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsSubmitReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsSubmitReviewEndpointMutableBuilder[Self <: ParametersPullsSubmitReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsSubmitReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsSubmitReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsSubmitReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
