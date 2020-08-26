package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersAppsCreateInstallationAccessTokenEndpoint extends js.Object {
  var parameters: AppsCreateInstallationAccessTokenEndpoint = js.native
  var request: AppsCreateInstallationAccessTokenRequestOptions = js.native
  var response: OctokitResponse[AppsCreateInstallationAccessTokenResponseData] = js.native
}

object ParametersAppsCreateInstallationAccessTokenEndpoint {
  @scala.inline
  def apply(
    parameters: AppsCreateInstallationAccessTokenEndpoint,
    request: AppsCreateInstallationAccessTokenRequestOptions,
    response: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]
  ): ParametersAppsCreateInstallationAccessTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateInstallationAccessTokenEndpoint]
  }
  @scala.inline
  implicit class ParametersAppsCreateInstallationAccessTokenEndpointOps[Self <: ParametersAppsCreateInstallationAccessTokenEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: AppsCreateInstallationAccessTokenEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: AppsCreateInstallationAccessTokenRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

