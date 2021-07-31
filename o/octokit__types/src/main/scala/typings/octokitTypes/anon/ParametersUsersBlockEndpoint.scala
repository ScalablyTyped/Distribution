package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersBlockEndpoint
import typings.octokitTypes.endpointsMod.UsersBlockRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersBlockEndpoint extends StObject {
  
  var parameters: UsersBlockEndpoint
  
  var request: UsersBlockRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersUsersBlockEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersBlockEndpoint,
    request: UsersBlockRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersUsersBlockEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersBlockEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersBlockEndpointMutableBuilder[Self <: ParametersUsersBlockEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersBlockEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersBlockRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
