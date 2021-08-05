package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForIssueCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsDeleteForIssueCommentEndpoint extends StObject {
  
  var parameters: ReactionsDeleteForIssueCommentEndpoint
  
  var request: ReactionsDeleteForIssueCommentRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReactionsDeleteForIssueCommentEndpoint {
  
  inline def apply(
    parameters: ReactionsDeleteForIssueCommentEndpoint,
    request: ReactionsDeleteForIssueCommentRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReactionsDeleteForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForIssueCommentEndpoint]
  }
  
  extension [Self <: ParametersReactionsDeleteForIssueCommentEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsDeleteForIssueCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReactionsDeleteForIssueCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
