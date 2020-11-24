package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersAddEmailForAuthenticatedEndpoint extends js.Object {
  
  var parameters: UsersAddEmailForAuthenticatedEndpoint = js.native
  
  var request: UsersAddEmailForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersAddEmailForAuthenticatedResponseData] = js.native
}
object ParametersUsersAddEmailForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersAddEmailForAuthenticatedEndpoint,
    request: UsersAddEmailForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersAddEmailForAuthenticatedResponseData]
  ): ParametersUsersAddEmailForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersAddEmailForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersAddEmailForAuthenticatedEndpointOps[Self <: ParametersUsersAddEmailForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersAddEmailForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersAddEmailForAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersAddEmailForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
