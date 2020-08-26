package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetRepoInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetRepoInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetRepoInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersAppsGetRepoInstallationEndpoint extends js.Object {
  var parameters: AppsGetRepoInstallationEndpoint = js.native
  var request: AppsGetRepoInstallationRequestOptions = js.native
  var response: OctokitResponse[AppsGetRepoInstallationResponseData] = js.native
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
  @scala.inline
  implicit class ParametersAppsGetRepoInstallationEndpointOps[Self <: ParametersAppsGetRepoInstallationEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: AppsGetRepoInstallationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: AppsGetRepoInstallationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetRepoInstallationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

