package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MarkdownRenderRawEndpoint
import typings.octokitTypes.endpointsMod.MarkdownRenderRawRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMarkdownRenderRawEndpoint extends StObject {
  
  var parameters: MarkdownRenderRawEndpoint = js.native
  
  var request: MarkdownRenderRawRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersMarkdownRenderRawEndpoint {
  
  @scala.inline
  def apply(
    parameters: MarkdownRenderRawEndpoint,
    request: MarkdownRenderRawRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMarkdownRenderRawEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMarkdownRenderRawEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMarkdownRenderRawEndpointMutableBuilder[Self <: ParametersMarkdownRenderRawEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MarkdownRenderRawEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MarkdownRenderRawRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
