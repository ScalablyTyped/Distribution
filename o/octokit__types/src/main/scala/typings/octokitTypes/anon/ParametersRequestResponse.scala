package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRevokeAuthorizationForApplicationEndpoint
import typings.octokitTypes.endpointsMod.AppsRevokeAuthorizationForApplicationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersRequestResponse extends js.Object {
  var parameters: AppsRevokeAuthorizationForApplicationEndpoint
  var request: AppsRevokeAuthorizationForApplicationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersRequestResponse {
  @scala.inline
  def apply(
    parameters: AppsRevokeAuthorizationForApplicationEndpoint,
    request: AppsRevokeAuthorizationForApplicationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersRequestResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequestResponse]
  }
}

