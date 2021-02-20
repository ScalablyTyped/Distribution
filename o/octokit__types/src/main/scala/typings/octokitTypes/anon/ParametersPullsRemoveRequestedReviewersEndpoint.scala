package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsRemoveRequestedReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsRemoveRequestedReviewersRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsRemoveRequestedReviewersEndpoint extends StObject {
  
  var parameters: PullsRemoveRequestedReviewersEndpoint = js.native
  
  var request: PullsRemoveRequestedReviewersRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersPullsRemoveRequestedReviewersEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsRemoveRequestedReviewersEndpoint,
    request: PullsRemoveRequestedReviewersRequestOptions,
    response: OctokitResponse[_]
  ): ParametersPullsRemoveRequestedReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsRemoveRequestedReviewersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsRemoveRequestedReviewersEndpointMutableBuilder[Self <: ParametersPullsRemoveRequestedReviewersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsRemoveRequestedReviewersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsRemoveRequestedReviewersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
