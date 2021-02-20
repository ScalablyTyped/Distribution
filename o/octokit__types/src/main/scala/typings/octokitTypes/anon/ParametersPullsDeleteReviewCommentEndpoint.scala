package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDeleteReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsDeleteReviewCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsDeleteReviewCommentEndpoint extends StObject {
  
  var parameters: PullsDeleteReviewCommentEndpoint = js.native
  
  var request: PullsDeleteReviewCommentRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersPullsDeleteReviewCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsDeleteReviewCommentEndpoint,
    request: PullsDeleteReviewCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersPullsDeleteReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDeleteReviewCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsDeleteReviewCommentEndpointMutableBuilder[Self <: ParametersPullsDeleteReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsDeleteReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsDeleteReviewCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
