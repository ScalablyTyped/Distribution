package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListReposAccessibleToInstallationEndpoint extends js.Object {
  var parameters: AppsListReposAccessibleToInstallationEndpoint
  var response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] with Data
}

object ParametersAppsListReposAccessibleToInstallationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListReposAccessibleToInstallationEndpoint,
    response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] with Data
  ): ParametersAppsListReposAccessibleToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListReposAccessibleToInstallationEndpoint]
  }
}

