package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListFollowersForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersUsersListFollowersForUserEndpoint extends js.Object {
  var parameters: UsersListFollowersForUserEndpoint = js.native
  var response: OctokitResponse[UsersListFollowersForUserResponseData] = js.native
}

object ParametersUsersListFollowersForUserEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListFollowersForUserEndpoint,
    response: OctokitResponse[UsersListFollowersForUserResponseData]
  ): ParametersUsersListFollowersForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowersForUserEndpoint]
  }
  @scala.inline
  implicit class ParametersUsersListFollowersForUserEndpointOps[Self <: ParametersUsersListFollowersForUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: UsersListFollowersForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowersForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

