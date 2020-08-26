package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListPlansStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansStubbedRequestOptions
import typings.octokitTypes.endpointsMod.AppsListPlansStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersAppsListPlansStubbedEndpoint extends js.Object {
  var parameters: AppsListPlansStubbedEndpoint = js.native
  var request: AppsListPlansStubbedRequestOptions = js.native
  var response: OctokitResponse[AppsListPlansStubbedResponseData] = js.native
}

object ParametersAppsListPlansStubbedEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListPlansStubbedEndpoint,
    request: AppsListPlansStubbedRequestOptions,
    response: OctokitResponse[AppsListPlansStubbedResponseData]
  ): ParametersAppsListPlansStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListPlansStubbedEndpoint]
  }
  @scala.inline
  implicit class ParametersAppsListPlansStubbedEndpointOps[Self <: ParametersAppsListPlansStubbedEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: AppsListPlansStubbedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: AppsListPlansStubbedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListPlansStubbedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

