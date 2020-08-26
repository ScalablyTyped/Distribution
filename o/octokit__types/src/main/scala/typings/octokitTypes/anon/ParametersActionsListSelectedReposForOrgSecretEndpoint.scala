package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsListSelectedReposForOrgSecretEndpoint extends js.Object {
  var parameters: ActionsListSelectedReposForOrgSecretEndpoint = js.native
  var request: ActionsListSelectedReposForOrgSecretRequestOptions = js.native
  var response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] = js.native
}

object ParametersActionsListSelectedReposForOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListSelectedReposForOrgSecretEndpoint,
    request: ActionsListSelectedReposForOrgSecretRequestOptions,
    response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
  ): ParametersActionsListSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelectedReposForOrgSecretEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsListSelectedReposForOrgSecretEndpointOps[Self <: ParametersActionsListSelectedReposForOrgSecretEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsListSelectedReposForOrgSecretEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsListSelectedReposForOrgSecretRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

