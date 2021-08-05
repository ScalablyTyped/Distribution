package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposUpdateCommitCommentEndpoint extends StObject {
  
  var parameters: ReposUpdateCommitCommentEndpoint
  
  var request: ReposUpdateCommitCommentRequestOptions
  
  var response: OctokitResponse[ReposUpdateCommitCommentResponseData]
}
object ParametersReposUpdateCommitCommentEndpoint {
  
  inline def apply(
    parameters: ReposUpdateCommitCommentEndpoint,
    request: ReposUpdateCommitCommentRequestOptions,
    response: OctokitResponse[ReposUpdateCommitCommentResponseData]
  ): ParametersReposUpdateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateCommitCommentEndpoint]
  }
  
  extension [Self <: ParametersReposUpdateCommitCommentEndpoint](x: Self) {
    
    inline def setParameters(value: ReposUpdateCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposUpdateCommitCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposUpdateCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
