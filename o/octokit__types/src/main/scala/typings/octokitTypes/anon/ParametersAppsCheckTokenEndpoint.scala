package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCheckTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsCheckTokenRequestOptions
import typings.octokitTypes.endpointsMod.AppsCheckTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersAppsCheckTokenEndpoint extends js.Object {
  var parameters: AppsCheckTokenEndpoint = js.native
  var request: AppsCheckTokenRequestOptions = js.native
  var response: OctokitResponse[AppsCheckTokenResponseData] = js.native
}

object ParametersAppsCheckTokenEndpoint {
  @scala.inline
  def apply(
    parameters: AppsCheckTokenEndpoint,
    request: AppsCheckTokenRequestOptions,
    response: OctokitResponse[AppsCheckTokenResponseData]
  ): ParametersAppsCheckTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCheckTokenEndpoint]
  }
  @scala.inline
  implicit class ParametersAppsCheckTokenEndpointOps[Self <: ParametersAppsCheckTokenEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: AppsCheckTokenEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: AppsCheckTokenRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCheckTokenResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

