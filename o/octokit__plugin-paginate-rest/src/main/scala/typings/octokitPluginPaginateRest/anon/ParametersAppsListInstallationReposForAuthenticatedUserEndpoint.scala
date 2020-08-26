package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersAppsListInstallationReposForAuthenticatedUserEndpoint extends js.Object {
  var parameters: AppsListInstallationReposForAuthenticatedUserEndpoint = js.native
  var response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData] with `21` = js.native
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
  @scala.inline
  implicit class ParametersAppsListInstallationReposForAuthenticatedUserEndpointOps[Self <: ParametersAppsListInstallationReposForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: AppsListInstallationReposForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData] with `21`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

