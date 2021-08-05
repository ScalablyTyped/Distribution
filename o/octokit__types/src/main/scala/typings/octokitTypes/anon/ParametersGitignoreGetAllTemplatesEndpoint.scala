package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesEndpoint
import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesRequestOptions
import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGitignoreGetAllTemplatesEndpoint extends StObject {
  
  var parameters: GitignoreGetAllTemplatesEndpoint
  
  var request: GitignoreGetAllTemplatesRequestOptions
  
  var response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
}
object ParametersGitignoreGetAllTemplatesEndpoint {
  
  inline def apply(
    parameters: GitignoreGetAllTemplatesEndpoint,
    request: GitignoreGetAllTemplatesRequestOptions,
    response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
  ): ParametersGitignoreGetAllTemplatesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitignoreGetAllTemplatesEndpoint]
  }
  
  extension [Self <: ParametersGitignoreGetAllTemplatesEndpoint](x: Self) {
    
    inline def setParameters(value: GitignoreGetAllTemplatesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GitignoreGetAllTemplatesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitignoreGetAllTemplatesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
