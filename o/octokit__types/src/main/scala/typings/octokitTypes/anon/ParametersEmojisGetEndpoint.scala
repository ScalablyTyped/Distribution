package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EmojisGetEndpoint
import typings.octokitTypes.endpointsMod.EmojisGetRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEmojisGetEndpoint extends StObject {
  
  var parameters: EmojisGetEndpoint = js.native
  
  var request: EmojisGetRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersEmojisGetEndpoint {
  
  @scala.inline
  def apply(parameters: EmojisGetEndpoint, request: EmojisGetRequestOptions, response: OctokitResponse[_]): ParametersEmojisGetEndpoint = {
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
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
