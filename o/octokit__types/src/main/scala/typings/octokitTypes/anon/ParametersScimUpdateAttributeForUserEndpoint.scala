package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimUpdateAttributeForUserEndpoint
import typings.octokitTypes.endpointsMod.ScimUpdateAttributeForUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimUpdateAttributeForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimUpdateAttributeForUserEndpoint extends js.Object {
  var parameters: ScimUpdateAttributeForUserEndpoint
  var request: ScimUpdateAttributeForUserRequestOptions
  var response: OctokitResponse[ScimUpdateAttributeForUserResponseData]
}

object ParametersScimUpdateAttributeForUserEndpoint {
  @scala.inline
  def apply(
    parameters: ScimUpdateAttributeForUserEndpoint,
    request: ScimUpdateAttributeForUserRequestOptions,
    response: OctokitResponse[ScimUpdateAttributeForUserResponseData]
  ): ParametersScimUpdateAttributeForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimUpdateAttributeForUserEndpoint]
  }
}

