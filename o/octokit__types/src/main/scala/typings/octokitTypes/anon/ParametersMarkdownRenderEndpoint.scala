package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MarkdownRenderEndpoint
import typings.octokitTypes.endpointsMod.MarkdownRenderRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMarkdownRenderEndpoint extends StObject {
  
  var parameters: MarkdownRenderEndpoint
  
  var request: MarkdownRenderRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersMarkdownRenderEndpoint {
  
  inline def apply(
    parameters: MarkdownRenderEndpoint,
    request: MarkdownRenderRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersMarkdownRenderEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMarkdownRenderEndpoint]
  }
  
  extension [Self <: ParametersMarkdownRenderEndpoint](x: Self) {
    
    inline def setParameters(value: MarkdownRenderEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MarkdownRenderRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
