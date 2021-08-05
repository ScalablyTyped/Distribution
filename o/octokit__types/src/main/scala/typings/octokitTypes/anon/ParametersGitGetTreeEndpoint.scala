package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetTreeEndpoint
import typings.octokitTypes.endpointsMod.GitGetTreeRequestOptions
import typings.octokitTypes.endpointsMod.GitGetTreeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGitGetTreeEndpoint extends StObject {
  
  var parameters: GitGetTreeEndpoint
  
  var request: GitGetTreeRequestOptions
  
  var response: OctokitResponse[GitGetTreeResponseData]
}
object ParametersGitGetTreeEndpoint {
  
  inline def apply(
    parameters: GitGetTreeEndpoint,
    request: GitGetTreeRequestOptions,
    response: OctokitResponse[GitGetTreeResponseData]
  ): ParametersGitGetTreeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetTreeEndpoint]
  }
  
  extension [Self <: ParametersGitGetTreeEndpoint](x: Self) {
    
    inline def setParameters(value: GitGetTreeEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GitGetTreeRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitGetTreeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
