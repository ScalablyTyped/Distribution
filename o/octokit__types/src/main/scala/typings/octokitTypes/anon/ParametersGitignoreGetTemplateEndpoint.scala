package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitignoreGetTemplateEndpoint
import typings.octokitTypes.endpointsMod.GitignoreGetTemplateRequestOptions
import typings.octokitTypes.endpointsMod.GitignoreGetTemplateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGitignoreGetTemplateEndpoint extends StObject {
  
  var parameters: GitignoreGetTemplateEndpoint
  
  var request: GitignoreGetTemplateRequestOptions
  
  var response: OctokitResponse[GitignoreGetTemplateResponseData]
}
object ParametersGitignoreGetTemplateEndpoint {
  
  inline def apply(
    parameters: GitignoreGetTemplateEndpoint,
    request: GitignoreGetTemplateRequestOptions,
    response: OctokitResponse[GitignoreGetTemplateResponseData]
  ): ParametersGitignoreGetTemplateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitignoreGetTemplateEndpoint]
  }
  
  extension [Self <: ParametersGitignoreGetTemplateEndpoint](x: Self) {
    
    inline def setParameters(value: GitignoreGetTemplateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GitignoreGetTemplateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitignoreGetTemplateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
