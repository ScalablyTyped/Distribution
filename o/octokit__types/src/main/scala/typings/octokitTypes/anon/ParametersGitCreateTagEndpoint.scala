package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateTagEndpoint
import typings.octokitTypes.endpointsMod.GitCreateTagRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGitCreateTagEndpoint extends StObject {
  
  var parameters: GitCreateTagEndpoint
  
  var request: GitCreateTagRequestOptions
  
  var response: OctokitResponse[GitCreateTagResponseData]
}
object ParametersGitCreateTagEndpoint {
  
  inline def apply(
    parameters: GitCreateTagEndpoint,
    request: GitCreateTagRequestOptions,
    response: OctokitResponse[GitCreateTagResponseData]
  ): ParametersGitCreateTagEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateTagEndpoint]
  }
  
  extension [Self <: ParametersGitCreateTagEndpoint](x: Self) {
    
    inline def setParameters(value: GitCreateTagEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GitCreateTagRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitCreateTagResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
