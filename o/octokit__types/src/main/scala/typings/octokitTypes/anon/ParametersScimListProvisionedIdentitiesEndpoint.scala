package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesEndpoint
import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesRequestOptions
import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimListProvisionedIdentitiesEndpoint extends js.Object {
  var parameters: ScimListProvisionedIdentitiesEndpoint
  var request: ScimListProvisionedIdentitiesRequestOptions
  var response: OctokitResponse[ScimListProvisionedIdentitiesResponseData]
}

object ParametersScimListProvisionedIdentitiesEndpoint {
  @scala.inline
  def apply(
    parameters: ScimListProvisionedIdentitiesEndpoint,
    request: ScimListProvisionedIdentitiesRequestOptions,
    response: OctokitResponse[ScimListProvisionedIdentitiesResponseData]
  ): ParametersScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimListProvisionedIdentitiesEndpoint]
  }
}

