package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRevokeInstallationTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsRevokeInstallationTokenRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsRevokeInstallationTokenEndpoint extends js.Object {
  var parameters: AppsRevokeInstallationTokenEndpoint
  var request: AppsRevokeInstallationTokenRequestOptions
  var response: OctokitResponse[_]
}

object ParametersAppsRevokeInstallationTokenEndpoint {
  @scala.inline
  def apply(
    parameters: AppsRevokeInstallationTokenEndpoint,
    request: AppsRevokeInstallationTokenRequestOptions,
    response: OctokitResponse[_]
  ): ParametersAppsRevokeInstallationTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsRevokeInstallationTokenEndpoint]
  }
}

