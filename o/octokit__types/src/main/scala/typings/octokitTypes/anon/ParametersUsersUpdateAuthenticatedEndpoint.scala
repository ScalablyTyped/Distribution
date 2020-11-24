package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersUpdateAuthenticatedEndpoint extends js.Object {
  
  var parameters: UsersUpdateAuthenticatedEndpoint = js.native
  
  var request: UsersUpdateAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersUpdateAuthenticatedResponseData] = js.native
}
object ParametersUsersUpdateAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersUpdateAuthenticatedEndpoint,
    request: UsersUpdateAuthenticatedRequestOptions,
    response: OctokitResponse[UsersUpdateAuthenticatedResponseData]
  ): ParametersUsersUpdateAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersUpdateAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersUpdateAuthenticatedEndpointOps[Self <: ParametersUsersUpdateAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersUpdateAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersUpdateAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersUpdateAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
