package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint extends js.Object {
  
  var parameters: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint = js.native
  
  var request: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData] = js.native
}
object ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint,
    request: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]
  ): ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpointOps[Self <: ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
