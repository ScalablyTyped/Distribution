package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListReposAccessibleToInstallationEndpoint extends js.Object {
  var parameters: AppsListReposAccessibleToInstallationEndpoint
  var request: AppsListReposAccessibleToInstallationRequestOptions
  var response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData]
}

object ParametersAppsListReposAccessibleToInstallationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListReposAccessibleToInstallationEndpoint,
    request: AppsListReposAccessibleToInstallationRequestOptions,
    response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData]
  ): ParametersAppsListReposAccessibleToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListReposAccessibleToInstallationEndpoint]
  }
}

