package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsCreateInstallationAccessTokenEndpoint extends js.Object {
  var parameters: AppsCreateInstallationAccessTokenEndpoint
  var request: AppsCreateInstallationAccessTokenRequestOptions
  var response: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]
}

object ParametersAppsCreateInstallationAccessTokenEndpoint {
  @scala.inline
  def apply(
    parameters: AppsCreateInstallationAccessTokenEndpoint,
    request: AppsCreateInstallationAccessTokenRequestOptions,
    response: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]
  ): ParametersAppsCreateInstallationAccessTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateInstallationAccessTokenEndpoint]
  }
}

