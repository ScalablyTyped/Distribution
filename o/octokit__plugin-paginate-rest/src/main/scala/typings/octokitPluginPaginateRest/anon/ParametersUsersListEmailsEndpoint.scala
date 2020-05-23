package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListEmailsEndpoint
import typings.octokitTypes.endpointsMod.UsersListEmailsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListEmailsEndpoint extends js.Object {
  var parameters: UsersListEmailsEndpoint
  var response: OctokitResponse[UsersListEmailsResponseData]
}

object ParametersUsersListEmailsEndpoint {
  @scala.inline
  def apply(parameters: UsersListEmailsEndpoint, response: OctokitResponse[UsersListEmailsResponseData]): ParametersUsersListEmailsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListEmailsEndpoint]
  }
}

