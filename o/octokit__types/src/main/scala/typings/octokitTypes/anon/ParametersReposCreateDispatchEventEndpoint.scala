package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateDispatchEventEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDispatchEventRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposCreateDispatchEventEndpoint extends StObject {
  
  var parameters: ReposCreateDispatchEventEndpoint
  
  var request: ReposCreateDispatchEventRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposCreateDispatchEventEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateDispatchEventEndpoint,
    request: ReposCreateDispatchEventRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposCreateDispatchEventEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDispatchEventEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateDispatchEventEndpointMutableBuilder[Self <: ParametersReposCreateDispatchEventEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateDispatchEventEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateDispatchEventRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
