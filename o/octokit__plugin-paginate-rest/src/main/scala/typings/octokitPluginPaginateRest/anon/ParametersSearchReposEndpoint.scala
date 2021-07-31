package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchReposEndpoint
import typings.octokitTypes.endpointsMod.SearchReposResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchReposEndpoint extends StObject {
  
  var parameters: SearchReposEndpoint
  
  var response: OctokitResponse[SearchReposResponseData] & `21`
}
object ParametersSearchReposEndpoint {
  
  @scala.inline
  def apply(parameters: SearchReposEndpoint, response: OctokitResponse[SearchReposResponseData] & `21`): ParametersSearchReposEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchReposEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchReposEndpointMutableBuilder[Self <: ParametersSearchReposEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchReposEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchReposResponseData] & `21`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
