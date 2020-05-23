package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListInstallationReposForAuthenticatedUserEndpoint extends js.Object {
  var parameters: AppsListInstallationReposForAuthenticatedUserEndpoint
  var request: AppsListInstallationReposForAuthenticatedUserRequestOptions
  var response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData]
}

object ParametersAppsListInstallationReposForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListInstallationReposForAuthenticatedUserEndpoint,
    request: AppsListInstallationReposForAuthenticatedUserRequestOptions,
    response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData]
  ): ParametersAppsListInstallationReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationReposForAuthenticatedUserEndpoint]
  }
}

