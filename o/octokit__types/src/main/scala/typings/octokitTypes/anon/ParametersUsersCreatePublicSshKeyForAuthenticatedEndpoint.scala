package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint extends js.Object {
  
  var parameters: UsersCreatePublicSshKeyForAuthenticatedEndpoint = js.native
  
  var request: UsersCreatePublicSshKeyForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData] = js.native
}
object ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersCreatePublicSshKeyForAuthenticatedEndpoint,
    request: UsersCreatePublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]
  ): ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersCreatePublicSshKeyForAuthenticatedEndpointOps[Self <: ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersCreatePublicSshKeyForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCreatePublicSshKeyForAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
