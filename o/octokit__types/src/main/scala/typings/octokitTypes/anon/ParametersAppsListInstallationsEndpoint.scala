package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationsEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsRequestOptions
import typings.octokitTypes.endpointsMod.AppsListInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListInstallationsEndpoint extends js.Object {
  var parameters: AppsListInstallationsEndpoint
  var request: AppsListInstallationsRequestOptions
  var response: OctokitResponse[AppsListInstallationsResponseData]
}

object ParametersAppsListInstallationsEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListInstallationsEndpoint,
    request: AppsListInstallationsRequestOptions,
    response: OctokitResponse[AppsListInstallationsResponseData]
  ): ParametersAppsListInstallationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationsEndpoint]
  }
}

