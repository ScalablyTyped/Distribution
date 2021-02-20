package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListReviewCommentsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsRequestOptions
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListReviewCommentsEndpoint extends StObject {
  
  var parameters: PullsListReviewCommentsEndpoint = js.native
  
  var request: PullsListReviewCommentsRequestOptions = js.native
  
  var response: OctokitResponse[PullsListReviewCommentsResponseData] = js.native
}
object ParametersPullsListReviewCommentsEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListReviewCommentsEndpoint,
    request: PullsListReviewCommentsRequestOptions,
    response: OctokitResponse[PullsListReviewCommentsResponseData]
  ): ParametersPullsListReviewCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewCommentsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListReviewCommentsEndpointMutableBuilder[Self <: ParametersPullsListReviewCommentsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListReviewCommentsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsListReviewCommentsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListReviewCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
