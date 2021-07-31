package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EmojisGetEndpoint
import typings.octokitTypes.endpointsMod.EmojisGetRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEmojisGetEndpoint extends StObject {
  
  var parameters: EmojisGetEndpoint
  
  var request: EmojisGetRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersEmojisGetEndpoint {
  
  @scala.inline
  def apply(parameters: EmojisGetEndpoint, request: EmojisGetRequestOptions, response: OctokitResponse[js.Any]): ParametersEmojisGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEmojisGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEmojisGetEndpointMutableBuilder[Self <: ParametersEmojisGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EmojisGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EmojisGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
