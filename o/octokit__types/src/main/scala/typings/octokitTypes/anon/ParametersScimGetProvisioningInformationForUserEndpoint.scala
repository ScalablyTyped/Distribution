package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserEndpoint
import typings.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimGetProvisioningInformationForUserEndpoint extends js.Object {
  var parameters: ScimGetProvisioningInformationForUserEndpoint
  var request: ScimGetProvisioningInformationForUserRequestOptions
  var response: OctokitResponse[ScimGetProvisioningInformationForUserResponseData]
}

object ParametersScimGetProvisioningInformationForUserEndpoint {
  @scala.inline
  def apply(
    parameters: ScimGetProvisioningInformationForUserEndpoint,
    request: ScimGetProvisioningInformationForUserRequestOptions,
    response: OctokitResponse[ScimGetProvisioningInformationForUserResponseData]
  ): ParametersScimGetProvisioningInformationForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimGetProvisioningInformationForUserEndpoint]
  }
}

