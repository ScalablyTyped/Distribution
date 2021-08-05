package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsCreateForIssueCommentEndpoint extends StObject {
  
  var parameters: ReactionsCreateForIssueCommentEndpoint
  
  var request: ReactionsCreateForIssueCommentRequestOptions
  
  var response: OctokitResponse[ReactionsCreateForIssueCommentResponseData]
}
object ParametersReactionsCreateForIssueCommentEndpoint {
  
  inline def apply(
    parameters: ReactionsCreateForIssueCommentEndpoint,
    request: ReactionsCreateForIssueCommentRequestOptions,
    response: OctokitResponse[ReactionsCreateForIssueCommentResponseData]
  ): ParametersReactionsCreateForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForIssueCommentEndpoint]
  }
  
  extension [Self <: ParametersReactionsCreateForIssueCommentEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsCreateForIssueCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReactionsCreateForIssueCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsCreateForIssueCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
