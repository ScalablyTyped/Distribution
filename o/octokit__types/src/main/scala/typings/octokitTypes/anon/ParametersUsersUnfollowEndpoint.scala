package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersUnfollowEndpoint
import typings.octokitTypes.endpointsMod.UsersUnfollowRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersUnfollowEndpoint extends StObject {
  
  var parameters: UsersUnfollowEndpoint = js.native
  
  var request: UsersUnfollowRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersUnfollowEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersUnfollowEndpoint,
    request: UsersUnfollowRequestOptions,
    response: OctokitResponse[_]
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
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
