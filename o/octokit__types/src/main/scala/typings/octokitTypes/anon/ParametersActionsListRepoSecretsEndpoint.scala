package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsListRepoSecretsEndpoint extends js.Object {
  var parameters: ActionsListRepoSecretsEndpoint = js.native
  var request: ActionsListRepoSecretsRequestOptions = js.native
  var response: OctokitResponse[ActionsListRepoSecretsResponseData] = js.native
}

object ParametersActionsListRepoSecretsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRepoSecretsEndpoint,
    request: ActionsListRepoSecretsRequestOptions,
    response: OctokitResponse[ActionsListRepoSecretsResponseData]
  ): ParametersActionsListRepoSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoSecretsEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsListRepoSecretsEndpointOps[Self <: ParametersActionsListRepoSecretsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsListRepoSecretsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsListRepoSecretsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoSecretsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

