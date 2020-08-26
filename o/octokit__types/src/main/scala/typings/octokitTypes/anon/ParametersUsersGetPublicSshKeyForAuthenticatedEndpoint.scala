package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersGetPublicSshKeyForAuthenticatedEndpoint = js.native
  var request: UsersGetPublicSshKeyForAuthenticatedRequestOptions = js.native
  var response: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData] = js.native
}

object ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersGetPublicSshKeyForAuthenticatedEndpoint,
    request: UsersGetPublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]
  ): ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class ParametersUsersGetPublicSshKeyForAuthenticatedEndpointOps[Self <: ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: UsersGetPublicSshKeyForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: UsersGetPublicSshKeyForAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

