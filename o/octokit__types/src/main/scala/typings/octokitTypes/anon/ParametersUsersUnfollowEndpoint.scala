package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersUnfollowEndpoint
import typings.octokitTypes.endpointsMod.UsersUnfollowRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersUnfollowEndpoint extends StObject {
  
  var parameters: UsersUnfollowEndpoint
  
  var request: UsersUnfollowRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersUsersUnfollowEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersUnfollowEndpoint,
    request: UsersUnfollowRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersUsersUnfollowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersUnfollowEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersUnfollowEndpointMutableBuilder[Self <: ParametersUsersUnfollowEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersUnfollowEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersUnfollowRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
