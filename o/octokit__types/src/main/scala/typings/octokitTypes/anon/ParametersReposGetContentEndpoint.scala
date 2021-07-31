package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetContentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContentRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetContentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetContentEndpoint extends StObject {
  
  var parameters: ReposGetContentEndpoint
  
  var request: ReposGetContentRequestOptions
  
  var response: OctokitResponse[ReposGetContentResponseData]
}
object ParametersReposGetContentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetContentEndpoint,
    request: ReposGetContentRequestOptions,
    response: OctokitResponse[ReposGetContentResponseData]
  ): ParametersReposGetContentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetContentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetContentEndpointMutableBuilder[Self <: ParametersReposGetContentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetContentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetContentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetContentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
