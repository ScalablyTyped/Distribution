package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetByUsernameEndpoint
import typings.octokitTypes.endpointsMod.UsersGetByUsernameRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetByUsernameResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersGetByUsernameEndpoint extends js.Object {
  var parameters: UsersGetByUsernameEndpoint
  var request: UsersGetByUsernameRequestOptions
  var response: OctokitResponse[UsersGetByUsernameResponseData]
}

object ParametersUsersGetByUsernameEndpoint {
  @scala.inline
  def apply(
    parameters: UsersGetByUsernameEndpoint,
    request: UsersGetByUsernameRequestOptions,
    response: OctokitResponse[UsersGetByUsernameResponseData]
  ): ParametersUsersGetByUsernameEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetByUsernameEndpoint]
  }
}

