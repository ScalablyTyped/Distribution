package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteCommitCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeleteCommitCommentEndpoint extends StObject {
  
  var parameters: ReposDeleteCommitCommentEndpoint
  
  var request: ReposDeleteCommitCommentRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeleteCommitCommentEndpoint {
  
  inline def apply(
    parameters: ReposDeleteCommitCommentEndpoint,
    request: ReposDeleteCommitCommentRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeleteCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteCommitCommentEndpoint]
  }
  
  extension [Self <: ParametersReposDeleteCommitCommentEndpoint](x: Self) {
    
    inline def setParameters(value: ReposDeleteCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposDeleteCommitCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
