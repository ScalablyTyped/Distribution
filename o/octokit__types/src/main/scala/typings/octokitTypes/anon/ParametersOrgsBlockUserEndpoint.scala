package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsBlockUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsBlockUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsBlockUserEndpoint extends StObject {
  
  var parameters: OrgsBlockUserEndpoint
  
  var request: OrgsBlockUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsBlockUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsBlockUserEndpoint,
    request: OrgsBlockUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsBlockUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsBlockUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsBlockUserEndpointMutableBuilder[Self <: ParametersOrgsBlockUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsBlockUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsBlockUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
