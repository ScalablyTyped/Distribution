package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForPullRequestCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForPullRequestCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsDeleteForPullRequestCommentEndpoint extends StObject {
  
  var parameters: ReactionsDeleteForPullRequestCommentEndpoint
  
  var request: ReactionsDeleteForPullRequestCommentRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReactionsDeleteForPullRequestCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForPullRequestCommentEndpoint,
    request: ReactionsDeleteForPullRequestCommentRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReactionsDeleteForPullRequestCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForPullRequestCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsDeleteForPullRequestCommentEndpointMutableBuilder[Self <: ParametersReactionsDeleteForPullRequestCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsDeleteForPullRequestCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsDeleteForPullRequestCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
