package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersUnblockEndpoint
import typings.octokitTypes.endpointsMod.UsersUnblockRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersUnblockEndpoint extends StObject {
  
  var parameters: UsersUnblockEndpoint = js.native
  
  var request: UsersUnblockRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersUnblockEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersUnblockEndpoint,
    request: UsersUnblockRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersUnblockEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersUnblockEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersUnblockEndpointMutableBuilder[Self <: ParametersUsersUnblockEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersUnblockEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersUnblockRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
