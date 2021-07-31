package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchReposEndpoint
import typings.octokitTypes.endpointsMod.SearchReposRequestOptions
import typings.octokitTypes.endpointsMod.SearchReposResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchReposEndpoint extends StObject {
  
  var parameters: SearchReposEndpoint
  
  var request: SearchReposRequestOptions
  
  var response: OctokitResponse[SearchReposResponseData]
}
object ParametersSearchReposEndpoint {
  
  @scala.inline
  def apply(
    parameters: SearchReposEndpoint,
    request: SearchReposRequestOptions,
    response: OctokitResponse[SearchReposResponseData]
  ): ParametersSearchReposEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchReposEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchReposEndpointMutableBuilder[Self <: ParametersSearchReposEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchReposEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: SearchReposRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchReposResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
