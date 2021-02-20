package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsDeletePendingReviewEndpoint extends StObject {
  
  var parameters: PullsDeletePendingReviewEndpoint = js.native
  
  var request: PullsDeletePendingReviewRequestOptions = js.native
  
  var response: OctokitResponse[PullsDeletePendingReviewResponseData] = js.native
}
object ParametersPullsDeletePendingReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsDeletePendingReviewEndpoint,
    request: PullsDeletePendingReviewRequestOptions,
    response: OctokitResponse[PullsDeletePendingReviewResponseData]
  ): ParametersPullsDeletePendingReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDeletePendingReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsDeletePendingReviewEndpointMutableBuilder[Self <: ParametersPullsDeletePendingReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsDeletePendingReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsDeletePendingReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsDeletePendingReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
