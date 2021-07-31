package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposListForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ReposListForAuthenticatedUserEndpoint
  
  var request: ReposListForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListForAuthenticatedUserEndpoint,
    request: ReposListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersReposListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
