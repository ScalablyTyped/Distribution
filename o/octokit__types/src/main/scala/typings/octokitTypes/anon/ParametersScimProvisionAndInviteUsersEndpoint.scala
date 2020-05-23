package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimProvisionAndInviteUsersEndpoint
import typings.octokitTypes.endpointsMod.ScimProvisionAndInviteUsersRequestOptions
import typings.octokitTypes.endpointsMod.ScimProvisionAndInviteUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimProvisionAndInviteUsersEndpoint extends js.Object {
  var parameters: ScimProvisionAndInviteUsersEndpoint
  var request: ScimProvisionAndInviteUsersRequestOptions
  var response: OctokitResponse[ScimProvisionAndInviteUsersResponseData]
}

object ParametersScimProvisionAndInviteUsersEndpoint {
  @scala.inline
  def apply(
    parameters: ScimProvisionAndInviteUsersEndpoint,
    request: ScimProvisionAndInviteUsersRequestOptions,
    response: OctokitResponse[ScimProvisionAndInviteUsersResponseData]
  ): ParametersScimProvisionAndInviteUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimProvisionAndInviteUsersEndpoint]
  }
}

