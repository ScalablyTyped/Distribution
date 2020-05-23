package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsDeleteAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.AppsDeleteAuthorizationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var parameters: AppsDeleteAuthorizationEndpoint
  var request: AppsDeleteAuthorizationRequestOptions
  var response: OctokitResponse[_]
}

object Response {
  @scala.inline
  def apply(
    parameters: AppsDeleteAuthorizationEndpoint,
    request: AppsDeleteAuthorizationRequestOptions,
    response: OctokitResponse[_]
  ): Response = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

