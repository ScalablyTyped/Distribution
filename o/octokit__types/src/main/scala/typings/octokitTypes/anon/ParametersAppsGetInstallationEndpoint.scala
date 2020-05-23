package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsGetInstallationEndpoint extends js.Object {
  var parameters: AppsGetInstallationEndpoint
  var request: AppsGetInstallationRequestOptions
  var response: OctokitResponse[AppsGetInstallationResponseData]
}

object ParametersAppsGetInstallationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsGetInstallationEndpoint,
    request: AppsGetInstallationRequestOptions,
    response: OctokitResponse[AppsGetInstallationResponseData]
  ): ParametersAppsGetInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetInstallationEndpoint]
  }
}

