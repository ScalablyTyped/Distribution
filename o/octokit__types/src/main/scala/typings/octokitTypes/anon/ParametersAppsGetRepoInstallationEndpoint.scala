package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetRepoInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetRepoInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetRepoInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsGetRepoInstallationEndpoint extends js.Object {
  var parameters: AppsGetRepoInstallationEndpoint
  var request: AppsGetRepoInstallationRequestOptions
  var response: OctokitResponse[AppsGetRepoInstallationResponseData]
}

object ParametersAppsGetRepoInstallationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsGetRepoInstallationEndpoint,
    request: AppsGetRepoInstallationRequestOptions,
    response: OctokitResponse[AppsGetRepoInstallationResponseData]
  ): ParametersAppsGetRepoInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetRepoInstallationEndpoint]
  }
}

