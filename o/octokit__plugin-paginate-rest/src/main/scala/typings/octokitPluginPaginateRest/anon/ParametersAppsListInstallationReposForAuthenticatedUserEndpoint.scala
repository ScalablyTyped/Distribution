package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListInstallationReposForAuthenticatedUserEndpoint extends js.Object {
  var parameters: AppsListInstallationReposForAuthenticatedUserEndpoint
  var response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData] with `21`
}

object ParametersAppsListInstallationReposForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListInstallationReposForAuthenticatedUserEndpoint,
    response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData] with `21`
  ): ParametersAppsListInstallationReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationReposForAuthenticatedUserEndpoint]
  }
}

