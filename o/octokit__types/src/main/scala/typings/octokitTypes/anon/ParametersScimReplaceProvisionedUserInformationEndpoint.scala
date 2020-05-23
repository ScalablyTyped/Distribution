package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimReplaceProvisionedUserInformationEndpoint
import typings.octokitTypes.endpointsMod.ScimReplaceProvisionedUserInformationRequestOptions
import typings.octokitTypes.endpointsMod.ScimReplaceProvisionedUserInformationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimReplaceProvisionedUserInformationEndpoint extends js.Object {
  var parameters: ScimReplaceProvisionedUserInformationEndpoint
  var request: ScimReplaceProvisionedUserInformationRequestOptions
  var response: OctokitResponse[ScimReplaceProvisionedUserInformationResponseData]
}

object ParametersScimReplaceProvisionedUserInformationEndpoint {
  @scala.inline
  def apply(
    parameters: ScimReplaceProvisionedUserInformationEndpoint,
    request: ScimReplaceProvisionedUserInformationRequestOptions,
    response: OctokitResponse[ScimReplaceProvisionedUserInformationResponseData]
  ): ParametersScimReplaceProvisionedUserInformationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimReplaceProvisionedUserInformationEndpoint]
  }
}

