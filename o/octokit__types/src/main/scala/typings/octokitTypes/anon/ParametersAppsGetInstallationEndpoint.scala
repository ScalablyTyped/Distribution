package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersAppsGetInstallationEndpoint extends js.Object {
  var parameters: AppsGetInstallationEndpoint = js.native
  var request: AppsGetInstallationRequestOptions = js.native
  var response: OctokitResponse[AppsGetInstallationResponseData] = js.native
}

object ParametersAppsGetInstallationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsGetInstallationEndpoint,
    request: AppsGetInstallationRequestOptions,
    response: OctokitResponse[AppsGetInstallationResponseData]
  ): ParametersAppsGetInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetInstallationEndpoint]
  }
  @scala.inline
  implicit class ParametersAppsGetInstallationEndpointOps[Self <: ParametersAppsGetInstallationEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: AppsGetInstallationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: AppsGetInstallationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetInstallationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

