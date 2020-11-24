package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersCreateGpgKeyForAuthenticatedEndpoint extends js.Object {
  
  var parameters: UsersCreateGpgKeyForAuthenticatedEndpoint = js.native
  
  var request: UsersCreateGpgKeyForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData] = js.native
}
object ParametersUsersCreateGpgKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersCreateGpgKeyForAuthenticatedEndpoint,
    request: UsersCreateGpgKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]
  ): ParametersUsersCreateGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCreateGpgKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersCreateGpgKeyForAuthenticatedEndpointOps[Self <: ParametersUsersCreateGpgKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersCreateGpgKeyForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCreateGpgKeyForAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
