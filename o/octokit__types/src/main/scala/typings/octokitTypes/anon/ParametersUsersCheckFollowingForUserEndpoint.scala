package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCheckFollowingForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersCheckFollowingForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersCheckFollowingForUserEndpoint extends js.Object {
  
  var parameters: UsersCheckFollowingForUserEndpoint = js.native
  
  var request: UsersCheckFollowingForUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersCheckFollowingForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersCheckFollowingForUserEndpoint,
    request: UsersCheckFollowingForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersCheckFollowingForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckFollowingForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersCheckFollowingForUserEndpointOps[Self <: ParametersUsersCheckFollowingForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersCheckFollowingForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCheckFollowingForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
