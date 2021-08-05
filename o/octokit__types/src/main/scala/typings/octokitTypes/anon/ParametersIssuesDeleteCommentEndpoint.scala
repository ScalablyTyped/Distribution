package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesDeleteCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesDeleteCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesDeleteCommentEndpoint extends StObject {
  
  var parameters: IssuesDeleteCommentEndpoint
  
  var request: IssuesDeleteCommentRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersIssuesDeleteCommentEndpoint {
  
  inline def apply(
    parameters: IssuesDeleteCommentEndpoint,
    request: IssuesDeleteCommentRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersIssuesDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesDeleteCommentEndpoint]
  }
  
  extension [Self <: ParametersIssuesDeleteCommentEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesDeleteCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesDeleteCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
