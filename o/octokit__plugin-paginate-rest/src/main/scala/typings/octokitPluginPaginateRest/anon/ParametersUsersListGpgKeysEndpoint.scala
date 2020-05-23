package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListGpgKeysEndpoint
import typings.octokitTypes.endpointsMod.UsersListGpgKeysResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListGpgKeysEndpoint extends js.Object {
  var parameters: UsersListGpgKeysEndpoint
  var response: OctokitResponse[UsersListGpgKeysResponseData]
}

object ParametersUsersListGpgKeysEndpoint {
  @scala.inline
  def apply(parameters: UsersListGpgKeysEndpoint, response: OctokitResponse[UsersListGpgKeysResponseData]): ParametersUsersListGpgKeysEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListGpgKeysEndpoint]
  }
}

