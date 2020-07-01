package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserEndpoint
import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimSetInformationForProvisionedUserEndpoint extends js.Object {
  var parameters: ScimSetInformationForProvisionedUserEndpoint
  var request: ScimSetInformationForProvisionedUserRequestOptions
  var response: OctokitResponse[ScimSetInformationForProvisionedUserResponseData]
}

object ParametersScimSetInformationForProvisionedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ScimSetInformationForProvisionedUserEndpoint,
    request: ScimSetInformationForProvisionedUserRequestOptions,
    response: OctokitResponse[ScimSetInformationForProvisionedUserResponseData]
  ): ParametersScimSetInformationForProvisionedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimSetInformationForProvisionedUserEndpoint]
  }
}

