package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationsEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  var parameters: AppsListInstallationsEndpoint = js.native
  var response: OctokitResponse[AppsListInstallationsResponseData] = js.native
}

object Parameters {
  @scala.inline
  def apply(
    parameters: AppsListInstallationsEndpoint,
    response: OctokitResponse[AppsListInstallationsResponseData]
  ): Parameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
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
    def setParameters(value: AppsListInstallationsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

