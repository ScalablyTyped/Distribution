package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesEndpoint
import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimListProvisionedIdentitiesEndpoint extends js.Object {
  var parameters: ScimListProvisionedIdentitiesEndpoint
  var response: OctokitResponse[ScimListProvisionedIdentitiesResponseData] with `12`
}

object ParametersScimListProvisionedIdentitiesEndpoint {
  @scala.inline
  def apply(
    parameters: ScimListProvisionedIdentitiesEndpoint,
    response: OctokitResponse[ScimListProvisionedIdentitiesResponseData] with `12`
  ): ParametersScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimListProvisionedIdentitiesEndpoint]
  }
}

