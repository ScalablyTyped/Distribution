package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListFollowingForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersUsersListFollowingForUserEndpoint extends js.Object {
  var parameters: UsersListFollowingForUserEndpoint = js.native
  var request: UsersListFollowingForUserRequestOptions = js.native
  var response: OctokitResponse[UsersListFollowingForUserResponseData] = js.native
}

object ParametersUsersListFollowingForUserEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListFollowingForUserEndpoint,
    request: UsersListFollowingForUserRequestOptions,
    response: OctokitResponse[UsersListFollowingForUserResponseData]
  ): ParametersUsersListFollowingForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowingForUserEndpoint]
  }
  @scala.inline
  implicit class ParametersUsersListFollowingForUserEndpointOps[Self <: ParametersUsersListFollowingForUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: UsersListFollowingForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: UsersListFollowingForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowingForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

