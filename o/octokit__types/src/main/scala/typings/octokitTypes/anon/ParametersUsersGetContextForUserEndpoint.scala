package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetContextForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersGetContextForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetContextForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersGetContextForUserEndpoint extends StObject {
  
  var parameters: UsersGetContextForUserEndpoint = js.native
  
  var request: UsersGetContextForUserRequestOptions = js.native
  
  var response: OctokitResponse[UsersGetContextForUserResponseData] = js.native
}
object ParametersUsersGetContextForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersGetContextForUserEndpoint,
    request: UsersGetContextForUserRequestOptions,
    response: OctokitResponse[UsersGetContextForUserResponseData]
  ): ParametersUsersGetContextForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetContextForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersGetContextForUserEndpointMutableBuilder[Self <: ParametersUsersGetContextForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersGetContextForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersGetContextForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetContextForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
