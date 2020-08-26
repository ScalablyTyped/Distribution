package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsGetSelfHostedRunnerForRepoEndpoint extends js.Object {
  var parameters: ActionsGetSelfHostedRunnerForRepoEndpoint = js.native
  var request: ActionsGetSelfHostedRunnerForRepoRequestOptions = js.native
  var response: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData] = js.native
}

object ParametersActionsGetSelfHostedRunnerForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetSelfHostedRunnerForRepoEndpoint,
    request: ActionsGetSelfHostedRunnerForRepoRequestOptions,
    response: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData]
  ): ParametersActionsGetSelfHostedRunnerForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetSelfHostedRunnerForRepoEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsGetSelfHostedRunnerForRepoEndpointOps[Self <: ParametersActionsGetSelfHostedRunnerForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsGetSelfHostedRunnerForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsGetSelfHostedRunnerForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

