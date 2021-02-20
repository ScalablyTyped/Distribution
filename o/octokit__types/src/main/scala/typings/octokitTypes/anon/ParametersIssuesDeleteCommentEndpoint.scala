package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesDeleteCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesDeleteCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesDeleteCommentEndpoint extends StObject {
  
  var parameters: IssuesDeleteCommentEndpoint = js.native
  
  var request: IssuesDeleteCommentRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersIssuesDeleteCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesDeleteCommentEndpoint,
    request: IssuesDeleteCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesDeleteCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesDeleteCommentEndpointMutableBuilder[Self <: ParametersIssuesDeleteCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesDeleteCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesDeleteCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
