package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateInstallationTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateInstallationTokenRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateInstallationTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsCreateInstallationTokenEndpoint extends js.Object {
  var parameters: AppsCreateInstallationTokenEndpoint
  var request: AppsCreateInstallationTokenRequestOptions
  var response: OctokitResponse[AppsCreateInstallationTokenResponseData]
}

object ParametersAppsCreateInstallationTokenEndpoint {
  @scala.inline
  def apply(
    parameters: AppsCreateInstallationTokenEndpoint,
    request: AppsCreateInstallationTokenRequestOptions,
    response: OctokitResponse[AppsCreateInstallationTokenResponseData]
  ): ParametersAppsCreateInstallationTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateInstallationTokenEndpoint]
  }
}

