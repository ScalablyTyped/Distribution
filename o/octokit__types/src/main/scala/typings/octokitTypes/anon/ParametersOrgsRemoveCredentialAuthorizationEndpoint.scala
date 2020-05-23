package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveCredentialAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveCredentialAuthorizationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsRemoveCredentialAuthorizationEndpoint extends js.Object {
  var parameters: OrgsRemoveCredentialAuthorizationEndpoint
  var request: OrgsRemoveCredentialAuthorizationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsRemoveCredentialAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsRemoveCredentialAuthorizationEndpoint,
    request: OrgsRemoveCredentialAuthorizationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsRemoveCredentialAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveCredentialAuthorizationEndpoint]
  }
}

