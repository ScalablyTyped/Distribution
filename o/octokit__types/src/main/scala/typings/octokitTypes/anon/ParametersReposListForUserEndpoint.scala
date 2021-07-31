package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListForUserEndpoint
import typings.octokitTypes.endpointsMod.ReposListForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListForUserEndpoint extends StObject {
  
  var parameters: ReposListForUserEndpoint
  
  var request: ReposListForUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposListForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListForUserEndpoint,
    request: ReposListForUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListForUserEndpointMutableBuilder[Self <: ParametersReposListForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
