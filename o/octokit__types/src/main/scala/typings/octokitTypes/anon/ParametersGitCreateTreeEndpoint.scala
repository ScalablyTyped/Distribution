package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateTreeEndpoint
import typings.octokitTypes.endpointsMod.GitCreateTreeRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateTreeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGitCreateTreeEndpoint extends StObject {
  
  var parameters: GitCreateTreeEndpoint
  
  var request: GitCreateTreeRequestOptions
  
  var response: OctokitResponse[GitCreateTreeResponseData]
}
object ParametersGitCreateTreeEndpoint {
  
  inline def apply(
    parameters: GitCreateTreeEndpoint,
    request: GitCreateTreeRequestOptions,
    response: OctokitResponse[GitCreateTreeResponseData]
  ): ParametersGitCreateTreeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateTreeEndpoint]
  }
  
  extension [Self <: ParametersGitCreateTreeEndpoint](x: Self) {
    
    inline def setParameters(value: GitCreateTreeEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GitCreateTreeRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitCreateTreeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
