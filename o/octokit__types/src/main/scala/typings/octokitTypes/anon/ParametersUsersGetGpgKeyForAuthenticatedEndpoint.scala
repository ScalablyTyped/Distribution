package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersUsersGetGpgKeyForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersGetGpgKeyForAuthenticatedEndpoint = js.native
  var request: UsersGetGpgKeyForAuthenticatedRequestOptions = js.native
  var response: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData] = js.native
}

object ParametersUsersGetGpgKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersGetGpgKeyForAuthenticatedEndpoint,
    request: UsersGetGpgKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData]
  ): ParametersUsersGetGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetGpgKeyForAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class ParametersUsersGetGpgKeyForAuthenticatedEndpointOps[Self <: ParametersUsersGetGpgKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: UsersGetGpgKeyForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: UsersGetGpgKeyForAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

