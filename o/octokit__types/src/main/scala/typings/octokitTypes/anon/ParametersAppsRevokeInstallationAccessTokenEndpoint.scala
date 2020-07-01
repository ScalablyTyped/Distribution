package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRevokeInstallationAccessTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsRevokeInstallationAccessTokenRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsRevokeInstallationAccessTokenEndpoint extends js.Object {
  var parameters: AppsRevokeInstallationAccessTokenEndpoint
  var request: AppsRevokeInstallationAccessTokenRequestOptions
  var response: OctokitResponse[_]
}

object ParametersAppsRevokeInstallationAccessTokenEndpoint {
  @scala.inline
  def apply(
    parameters: AppsRevokeInstallationAccessTokenEndpoint,
    request: AppsRevokeInstallationAccessTokenRequestOptions,
    response: OctokitResponse[_]
  ): ParametersAppsRevokeInstallationAccessTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsRevokeInstallationAccessTokenEndpoint]
  }
}

