package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsDeleteInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsDeleteInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  var parameters: AppsDeleteInstallationEndpoint
  var request: AppsDeleteInstallationRequestOptions
  var response: OctokitResponse[_]
}

object Parameters {
  @scala.inline
  def apply(
    parameters: AppsDeleteInstallationEndpoint,
    request: AppsDeleteInstallationRequestOptions,
    response: OctokitResponse[_]
  ): Parameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

