package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchTopicsEndpoint
import typings.octokitTypes.endpointsMod.SearchTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchTopicsEndpoint extends StObject {
  
  var parameters: SearchTopicsEndpoint
  
  var response: OctokitResponse[SearchTopicsResponseData] & `22`
}
object ParametersSearchTopicsEndpoint {
  
  @scala.inline
  def apply(parameters: SearchTopicsEndpoint, response: OctokitResponse[SearchTopicsResponseData] & `22`): ParametersSearchTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchTopicsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchTopicsEndpointMutableBuilder[Self <: ParametersSearchTopicsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchTopicsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchTopicsResponseData] & `22`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
