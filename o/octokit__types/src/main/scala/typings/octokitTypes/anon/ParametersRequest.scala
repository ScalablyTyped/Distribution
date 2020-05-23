package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRevokeGrantForApplicationEndpoint
import typings.octokitTypes.endpointsMod.AppsRevokeGrantForApplicationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersRequest extends js.Object {
  var parameters: AppsRevokeGrantForApplicationEndpoint
  var request: AppsRevokeGrantForApplicationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersRequest {
  @scala.inline
  def apply(
    parameters: AppsRevokeGrantForApplicationEndpoint,
    request: AppsRevokeGrantForApplicationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersRequest = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequest]
  }
}

