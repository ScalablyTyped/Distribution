package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForCommitCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsDeleteForCommitCommentEndpoint extends StObject {
  
  var parameters: ReactionsDeleteForCommitCommentEndpoint
  
  var request: ReactionsDeleteForCommitCommentRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReactionsDeleteForCommitCommentEndpoint {
  
  inline def apply(
    parameters: ReactionsDeleteForCommitCommentEndpoint,
    request: ReactionsDeleteForCommitCommentRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReactionsDeleteForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForCommitCommentEndpoint]
  }
  
  extension [Self <: ParametersReactionsDeleteForCommitCommentEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsDeleteForCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReactionsDeleteForCommitCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
