package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetByUsernameEndpoint
import typings.octokitTypes.endpointsMod.UsersGetByUsernameRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetByUsernameResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersGetByUsernameEndpoint extends js.Object {
  
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
  implicit class ParametersUsersGetByUsernameEndpointOps[Self <: ParametersUsersGetByUsernameEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: UsersGetByUsernameEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersGetByUsernameRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetByUsernameResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
