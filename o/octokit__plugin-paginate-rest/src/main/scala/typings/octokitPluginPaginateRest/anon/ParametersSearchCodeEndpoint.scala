package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchCodeEndpoint
import typings.octokitTypes.endpointsMod.SearchCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchCodeEndpoint extends StObject {
  
  var parameters: SearchCodeEndpoint
  
  var response: OctokitResponse[SearchCodeResponseData] & `17`
}
object ParametersSearchCodeEndpoint {
  
  @scala.inline
  def apply(parameters: SearchCodeEndpoint, response: OctokitResponse[SearchCodeResponseData] & `17`): ParametersSearchCodeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCodeEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchCodeEndpointMutableBuilder[Self <: ParametersSearchCodeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchCodeEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchCodeResponseData] & `17`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
