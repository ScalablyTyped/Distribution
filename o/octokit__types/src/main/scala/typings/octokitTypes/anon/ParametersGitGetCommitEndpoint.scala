package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetCommitEndpoint
import typings.octokitTypes.endpointsMod.GitGetCommitRequestOptions
import typings.octokitTypes.endpointsMod.GitGetCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGitGetCommitEndpoint extends StObject {
  
  var parameters: GitGetCommitEndpoint
  
  var request: GitGetCommitRequestOptions
  
  var response: OctokitResponse[GitGetCommitResponseData]
}
object ParametersGitGetCommitEndpoint {
  
  inline def apply(
    parameters: GitGetCommitEndpoint,
    request: GitGetCommitRequestOptions,
    response: OctokitResponse[GitGetCommitResponseData]
  ): ParametersGitGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetCommitEndpoint]
  }
  
  extension [Self <: ParametersGitGetCommitEndpoint](x: Self) {
    
    inline def setParameters(value: GitGetCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GitGetCommitRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitGetCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
