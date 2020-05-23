package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimUpdateUserAttributeEndpoint
import typings.octokitTypes.endpointsMod.ScimUpdateUserAttributeRequestOptions
import typings.octokitTypes.endpointsMod.ScimUpdateUserAttributeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimUpdateUserAttributeEndpoint extends js.Object {
  var parameters: ScimUpdateUserAttributeEndpoint
  var request: ScimUpdateUserAttributeRequestOptions
  var response: OctokitResponse[ScimUpdateUserAttributeResponseData]
}

object ParametersScimUpdateUserAttributeEndpoint {
  @scala.inline
  def apply(
    parameters: ScimUpdateUserAttributeEndpoint,
    request: ScimUpdateUserAttributeRequestOptions,
    response: OctokitResponse[ScimUpdateUserAttributeResponseData]
  ): ParametersScimUpdateUserAttributeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimUpdateUserAttributeEndpoint]
  }
}

