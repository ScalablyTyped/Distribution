package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListEndpoint
import typings.octokitTypes.endpointsMod.UsersListRequestOptions
import typings.octokitTypes.endpointsMod.UsersListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListEndpoint extends js.Object {
  var parameters: UsersListEndpoint
  var request: UsersListRequestOptions
  var response: OctokitResponse[UsersListResponseData]
}

object ParametersUsersListEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListEndpoint,
    request: UsersListRequestOptions,
    response: OctokitResponse[UsersListResponseData]
  ): ParametersUsersListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListEndpoint]
  }
}

