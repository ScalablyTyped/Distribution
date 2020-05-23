package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsAddRepoToInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsAddRepoToInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsAddRepoToInstallationEndpoint extends js.Object {
  var parameters: AppsAddRepoToInstallationEndpoint
  var request: AppsAddRepoToInstallationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersAppsAddRepoToInstallationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsAddRepoToInstallationEndpoint,
    request: AppsAddRepoToInstallationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersAppsAddRepoToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsAddRepoToInstallationEndpoint]
  }
}

