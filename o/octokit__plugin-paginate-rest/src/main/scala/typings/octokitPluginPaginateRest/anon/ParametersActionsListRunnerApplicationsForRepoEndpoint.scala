package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsListRunnerApplicationsForRepoEndpoint extends js.Object {
  var parameters: ActionsListRunnerApplicationsForRepoEndpoint = js.native
  var response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData] = js.native
}

object ParametersActionsListRunnerApplicationsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRunnerApplicationsForRepoEndpoint,
    response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
  ): ParametersActionsListRunnerApplicationsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRunnerApplicationsForRepoEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsListRunnerApplicationsForRepoEndpointOps[Self <: ParametersActionsListRunnerApplicationsForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsListRunnerApplicationsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

