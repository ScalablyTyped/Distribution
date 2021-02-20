package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchCodeEndpoint
import typings.octokitTypes.endpointsMod.SearchCodeRequestOptions
import typings.octokitTypes.endpointsMod.SearchCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchCodeEndpoint extends StObject {
  
  var parameters: SearchCodeEndpoint = js.native
  
  var request: SearchCodeRequestOptions = js.native
  
  var response: OctokitResponse[SearchCodeResponseData] = js.native
}
object ParametersSearchCodeEndpoint {
  
  @scala.inline
  def apply(
    parameters: SearchCodeEndpoint,
    request: SearchCodeRequestOptions,
    response: OctokitResponse[SearchCodeResponseData]
  ): ParametersSearchCodeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCodeEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchCodeEndpointMutableBuilder[Self <: ParametersSearchCodeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchCodeEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: SearchCodeRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchCodeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
