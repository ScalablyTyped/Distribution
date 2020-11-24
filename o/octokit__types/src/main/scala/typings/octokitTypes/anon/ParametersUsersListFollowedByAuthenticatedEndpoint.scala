package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListFollowedByAuthenticatedEndpoint extends js.Object {
  
  var parameters: UsersListFollowedByAuthenticatedEndpoint = js.native
  
  var request: UsersListFollowedByAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData] = js.native
}
object ParametersUsersListFollowedByAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListFollowedByAuthenticatedEndpoint,
    request: UsersListFollowedByAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]
  ): ParametersUsersListFollowedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowedByAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListFollowedByAuthenticatedEndpointOps[Self <: ParametersUsersListFollowedByAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersListFollowedByAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListFollowedByAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
