package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsCreateReviewCommentEndpoint extends StObject {
  
  var parameters: PullsCreateReviewCommentEndpoint = js.native
  
  var request: PullsCreateReviewCommentRequestOptions = js.native
  
  var response: OctokitResponse[PullsCreateReviewCommentResponseData] = js.native
}
object ParametersPullsCreateReviewCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsCreateReviewCommentEndpoint,
    request: PullsCreateReviewCommentRequestOptions,
    response: OctokitResponse[PullsCreateReviewCommentResponseData]
  ): ParametersPullsCreateReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReviewCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsCreateReviewCommentEndpointMutableBuilder[Self <: ParametersPullsCreateReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsCreateReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsCreateReviewCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsCreateReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
