package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListBlockedEndpoint
import typings.octokitTypes.endpointsMod.UsersListBlockedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListBlockedEndpoint extends js.Object {
  var parameters: UsersListBlockedEndpoint
  var response: OctokitResponse[UsersListBlockedResponseData]
}

object ParametersUsersListBlockedEndpoint {
  @scala.inline
  def apply(parameters: UsersListBlockedEndpoint, response: OctokitResponse[UsersListBlockedResponseData]): ParametersUsersListBlockedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListBlockedEndpoint]
  }
}

