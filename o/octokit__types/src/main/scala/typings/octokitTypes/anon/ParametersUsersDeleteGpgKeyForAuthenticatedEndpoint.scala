package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersDeleteGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersDeleteGpgKeyForAuthenticatedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint extends js.Object {
  
  var parameters: UsersDeleteGpgKeyForAuthenticatedEndpoint = js.native
  
  var request: UsersDeleteGpgKeyForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersDeleteGpgKeyForAuthenticatedEndpoint,
    request: UsersDeleteGpgKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersDeleteGpgKeyForAuthenticatedEndpointOps[Self <: ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersDeleteGpgKeyForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersDeleteGpgKeyForAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
