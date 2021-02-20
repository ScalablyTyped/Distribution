package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersFollowEndpoint
import typings.octokitTypes.endpointsMod.UsersFollowRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersFollowEndpoint extends StObject {
  
  var parameters: UsersFollowEndpoint = js.native
  
  var request: UsersFollowRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersFollowEndpoint {
  
  @scala.inline
  def apply(parameters: UsersFollowEndpoint, request: UsersFollowRequestOptions, response: OctokitResponse[_]): ParametersUsersFollowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersFollowEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersFollowEndpointMutableBuilder[Self <: ParametersUsersFollowEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersFollowEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersFollowRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
