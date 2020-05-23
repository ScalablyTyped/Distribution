package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsUnsuspendInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsUnsuspendInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var parameters: AppsUnsuspendInstallationEndpoint
  var request: AppsUnsuspendInstallationRequestOptions
  var response: OctokitResponse[_]
}

object Request {
  @scala.inline
  def apply(
    parameters: AppsUnsuspendInstallationEndpoint,
    request: AppsUnsuspendInstallationRequestOptions,
    response: OctokitResponse[_]
  ): Request = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

