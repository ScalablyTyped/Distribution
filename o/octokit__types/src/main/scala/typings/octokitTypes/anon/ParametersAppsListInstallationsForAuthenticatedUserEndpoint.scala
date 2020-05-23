package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListInstallationsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: AppsListInstallationsForAuthenticatedUserEndpoint
  var request: AppsListInstallationsForAuthenticatedUserRequestOptions
  var response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData]
}

object ParametersAppsListInstallationsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListInstallationsForAuthenticatedUserEndpoint,
    request: AppsListInstallationsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData]
  ): ParametersAppsListInstallationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationsForAuthenticatedUserEndpoint]
  }
}

