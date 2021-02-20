package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetByUsernameEndpoint
import typings.octokitTypes.endpointsMod.UsersGetByUsernameRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetByUsernameResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersGetByUsernameEndpoint extends StObject {
  
  var parameters: UsersGetByUsernameEndpoint = js.native
  
  var request: UsersGetByUsernameRequestOptions = js.native
  
  var response: OctokitResponse[UsersGetByUsernameResponseData] = js.native
}
object ParametersUsersGetByUsernameEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersGetByUsernameEndpoint,
    request: UsersGetByUsernameRequestOptions,
    response: OctokitResponse[UsersGetByUsernameResponseData]
  ): ParametersUsersGetByUsernameEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetByUsernameEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersGetByUsernameEndpointMutableBuilder[Self <: ParametersUsersGetByUsernameEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersGetByUsernameEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersGetByUsernameRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetByUsernameResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
