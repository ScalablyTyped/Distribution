package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitUpdateRefEndpoint
import typings.octokitTypes.endpointsMod.GitUpdateRefRequestOptions
import typings.octokitTypes.endpointsMod.GitUpdateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGitUpdateRefEndpoint extends StObject {
  
  var parameters: GitUpdateRefEndpoint
  
  var request: GitUpdateRefRequestOptions
  
  var response: OctokitResponse[GitUpdateRefResponseData]
}
object ParametersGitUpdateRefEndpoint {
  
  inline def apply(
    parameters: GitUpdateRefEndpoint,
    request: GitUpdateRefRequestOptions,
    response: OctokitResponse[GitUpdateRefResponseData]
  ): ParametersGitUpdateRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitUpdateRefEndpoint]
  }
  
  extension [Self <: ParametersGitUpdateRefEndpoint](x: Self) {
    
    inline def setParameters(value: GitUpdateRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GitUpdateRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitUpdateRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
