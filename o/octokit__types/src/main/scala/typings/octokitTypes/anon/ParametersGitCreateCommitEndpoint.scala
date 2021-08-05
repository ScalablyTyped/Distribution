package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateCommitEndpoint
import typings.octokitTypes.endpointsMod.GitCreateCommitRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGitCreateCommitEndpoint extends StObject {
  
  var parameters: GitCreateCommitEndpoint
  
  var request: GitCreateCommitRequestOptions
  
  var response: OctokitResponse[GitCreateCommitResponseData]
}
object ParametersGitCreateCommitEndpoint {
  
  inline def apply(
    parameters: GitCreateCommitEndpoint,
    request: GitCreateCommitRequestOptions,
    response: OctokitResponse[GitCreateCommitResponseData]
  ): ParametersGitCreateCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateCommitEndpoint]
  }
  
  extension [Self <: ParametersGitCreateCommitEndpoint](x: Self) {
    
    inline def setParameters(value: GitCreateCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GitCreateCommitRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitCreateCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
