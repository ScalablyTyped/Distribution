package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimProvisionAndInviteUserEndpoint
import typings.octokitTypes.endpointsMod.ScimProvisionAndInviteUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimProvisionAndInviteUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimProvisionAndInviteUserEndpoint extends js.Object {
  var parameters: ScimProvisionAndInviteUserEndpoint
  var request: ScimProvisionAndInviteUserRequestOptions
  var response: OctokitResponse[ScimProvisionAndInviteUserResponseData]
}

object ParametersScimProvisionAndInviteUserEndpoint {
  @scala.inline
  def apply(
    parameters: ScimProvisionAndInviteUserEndpoint,
    request: ScimProvisionAndInviteUserRequestOptions,
    response: OctokitResponse[ScimProvisionAndInviteUserResponseData]
  ): ParametersScimProvisionAndInviteUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimProvisionAndInviteUserEndpoint]
  }
}

