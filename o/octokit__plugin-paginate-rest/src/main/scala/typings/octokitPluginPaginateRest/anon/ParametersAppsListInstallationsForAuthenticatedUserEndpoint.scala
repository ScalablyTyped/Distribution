package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListInstallationsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: AppsListInstallationsForAuthenticatedUserEndpoint
  var response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] with `11`
}

object ParametersAppsListInstallationsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListInstallationsForAuthenticatedUserEndpoint,
    response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] with `11`
  ): ParametersAppsListInstallationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationsForAuthenticatedUserEndpoint]
  }
}

