package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsResetTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsResetTokenRequestOptions
import typings.octokitTypes.endpointsMod.AppsResetTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersAppsResetTokenEndpoint extends js.Object {
  var parameters: AppsResetTokenEndpoint = js.native
  var request: AppsResetTokenRequestOptions = js.native
  var response: OctokitResponse[AppsResetTokenResponseData] = js.native
}

object ParametersAppsResetTokenEndpoint {
  @scala.inline
  def apply(
    parameters: AppsResetTokenEndpoint,
    request: AppsResetTokenRequestOptions,
    response: OctokitResponse[AppsResetTokenResponseData]
  ): ParametersAppsResetTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsResetTokenEndpoint]
  }
  @scala.inline
  implicit class ParametersAppsResetTokenEndpointOps[Self <: ParametersAppsResetTokenEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: AppsResetTokenEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: AppsResetTokenRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[AppsResetTokenResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

