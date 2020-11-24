package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetContextForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersGetContextForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetContextForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersGetContextForUserEndpoint extends js.Object {
  
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
  implicit class ParametersUsersGetContextForUserEndpointOps[Self <: ParametersUsersGetContextForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersGetContextForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersGetContextForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetContextForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
