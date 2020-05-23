package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimGetProvisioningDetailsForUserEndpoint
import typings.octokitTypes.endpointsMod.ScimGetProvisioningDetailsForUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimGetProvisioningDetailsForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimGetProvisioningDetailsForUserEndpoint extends js.Object {
  var parameters: ScimGetProvisioningDetailsForUserEndpoint
  var request: ScimGetProvisioningDetailsForUserRequestOptions
  var response: OctokitResponse[ScimGetProvisioningDetailsForUserResponseData]
}

object ParametersScimGetProvisioningDetailsForUserEndpoint {
  @scala.inline
  def apply(
    parameters: ScimGetProvisioningDetailsForUserEndpoint,
    request: ScimGetProvisioningDetailsForUserRequestOptions,
    response: OctokitResponse[ScimGetProvisioningDetailsForUserResponseData]
  ): ParametersScimGetProvisioningDetailsForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimGetProvisioningDetailsForUserEndpoint]
  }
}

