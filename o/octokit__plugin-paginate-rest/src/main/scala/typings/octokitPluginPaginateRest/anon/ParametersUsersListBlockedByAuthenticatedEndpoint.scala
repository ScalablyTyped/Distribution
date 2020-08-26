package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListBlockedByAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListBlockedByAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersUsersListBlockedByAuthenticatedEndpoint extends js.Object {
  var parameters: UsersListBlockedByAuthenticatedEndpoint = js.native
  var response: OctokitResponse[UsersListBlockedByAuthenticatedResponseData] = js.native
}

object ParametersUsersListBlockedByAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListBlockedByAuthenticatedEndpoint,
    response: OctokitResponse[UsersListBlockedByAuthenticatedResponseData]
  ): ParametersUsersListBlockedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListBlockedByAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class ParametersUsersListBlockedByAuthenticatedEndpointOps[Self <: ParametersUsersListBlockedByAuthenticatedEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: UsersListBlockedByAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListBlockedByAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

