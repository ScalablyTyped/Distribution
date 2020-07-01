package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveSamlSsoAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveSamlSsoAuthorizationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsRemoveSamlSsoAuthorizationEndpoint extends js.Object {
  var parameters: OrgsRemoveSamlSsoAuthorizationEndpoint
  var request: OrgsRemoveSamlSsoAuthorizationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsRemoveSamlSsoAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsRemoveSamlSsoAuthorizationEndpoint,
    request: OrgsRemoveSamlSsoAuthorizationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsRemoveSamlSsoAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveSamlSsoAuthorizationEndpoint]
  }
}

