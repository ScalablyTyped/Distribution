package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetUserInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetUserInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetUserInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsGetUserInstallationEndpoint extends js.Object {
  var parameters: AppsGetUserInstallationEndpoint
  var request: AppsGetUserInstallationRequestOptions
  var response: OctokitResponse[AppsGetUserInstallationResponseData]
}

object ParametersAppsGetUserInstallationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsGetUserInstallationEndpoint,
    request: AppsGetUserInstallationRequestOptions,
    response: OctokitResponse[AppsGetUserInstallationResponseData]
  ): ParametersAppsGetUserInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetUserInstallationEndpoint]
  }
}

