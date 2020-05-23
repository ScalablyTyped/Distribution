package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsGetOrgInstallationEndpoint extends js.Object {
  var parameters: AppsGetOrgInstallationEndpoint
  var request: AppsGetOrgInstallationRequestOptions
  var response: OctokitResponse[AppsGetOrgInstallationResponseData]
}

object ParametersAppsGetOrgInstallationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsGetOrgInstallationEndpoint,
    request: AppsGetOrgInstallationRequestOptions,
    response: OctokitResponse[AppsGetOrgInstallationResponseData]
  ): ParametersAppsGetOrgInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetOrgInstallationEndpoint]
  }
}

