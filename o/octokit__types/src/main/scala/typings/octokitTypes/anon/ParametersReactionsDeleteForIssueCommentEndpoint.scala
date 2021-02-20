package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForIssueCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsDeleteForIssueCommentEndpoint extends StObject {
  
  var parameters: ReactionsDeleteForIssueCommentEndpoint = js.native
  
  var request: ReactionsDeleteForIssueCommentRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReactionsDeleteForIssueCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForIssueCommentEndpoint,
    request: ReactionsDeleteForIssueCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForIssueCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsDeleteForIssueCommentEndpointMutableBuilder[Self <: ParametersReactionsDeleteForIssueCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsDeleteForIssueCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsDeleteForIssueCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
