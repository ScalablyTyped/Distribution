package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCheckAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.AppsCheckAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.AppsCheckAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersAppsCheckAuthorizationEndpoint extends js.Object {
  var parameters: AppsCheckAuthorizationEndpoint = js.native
  var request: AppsCheckAuthorizationRequestOptions = js.native
  var response: OctokitResponse[AppsCheckAuthorizationResponseData] = js.native
}

object ParametersAppsCheckAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsCheckAuthorizationEndpoint,
    request: AppsCheckAuthorizationRequestOptions,
    response: OctokitResponse[AppsCheckAuthorizationResponseData]
  ): ParametersAppsCheckAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCheckAuthorizationEndpoint]
  }
  @scala.inline
  implicit class ParametersAppsCheckAuthorizationEndpointOps[Self <: ParametersAppsCheckAuthorizationEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: AppsCheckAuthorizationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: AppsCheckAuthorizationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCheckAuthorizationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

