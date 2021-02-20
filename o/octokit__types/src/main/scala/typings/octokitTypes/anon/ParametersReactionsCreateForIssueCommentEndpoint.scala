package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsCreateForIssueCommentEndpoint extends StObject {
  
  var parameters: ReactionsCreateForIssueCommentEndpoint = js.native
  
  var request: ReactionsCreateForIssueCommentRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsCreateForIssueCommentResponseData] = js.native
}
object ParametersReactionsCreateForIssueCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForIssueCommentEndpoint,
    request: ReactionsCreateForIssueCommentRequestOptions,
    response: OctokitResponse[ReactionsCreateForIssueCommentResponseData]
  ): ParametersReactionsCreateForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForIssueCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForIssueCommentEndpointMutableBuilder[Self <: ParametersReactionsCreateForIssueCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsCreateForIssueCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForIssueCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForIssueCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
