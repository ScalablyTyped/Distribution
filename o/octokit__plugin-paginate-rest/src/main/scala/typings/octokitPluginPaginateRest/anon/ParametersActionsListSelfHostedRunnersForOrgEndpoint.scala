package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsListSelfHostedRunnersForOrgEndpoint extends js.Object {
  var parameters: ActionsListSelfHostedRunnersForOrgEndpoint = js.native
  var response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData] with DataArray = js.native
}

object ParametersActionsListSelfHostedRunnersForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersForOrgEndpoint,
    response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData] with DataArray
  ): ParametersActionsListSelfHostedRunnersForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersForOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnersForOrgEndpointOps[Self <: ParametersActionsListSelfHostedRunnersForOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsListSelfHostedRunnersForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData] with DataArray): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

