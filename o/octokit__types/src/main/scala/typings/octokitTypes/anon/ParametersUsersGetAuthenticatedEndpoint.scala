package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersGetAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersGetAuthenticatedEndpoint extends js.Object {
  
  var parameters: UsersGetAuthenticatedEndpoint = js.native
  
  var request: UsersGetAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersGetAuthenticatedResponseData] = js.native
}
object ParametersUsersGetAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersGetAuthenticatedEndpoint,
    request: UsersGetAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetAuthenticatedResponseData]
  ): ParametersUsersGetAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersGetAuthenticatedEndpointOps[Self <: ParametersUsersGetAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersGetAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersGetAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
