package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRemoveRepoFromInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsRemoveRepoFromInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsRemoveRepoFromInstallationEndpoint extends js.Object {
  var parameters: AppsRemoveRepoFromInstallationEndpoint
  var request: AppsRemoveRepoFromInstallationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersAppsRemoveRepoFromInstallationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsRemoveRepoFromInstallationEndpoint,
    request: AppsRemoveRepoFromInstallationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersAppsRemoveRepoFromInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsRemoveRepoFromInstallationEndpoint]
  }
}

