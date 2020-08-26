package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsRemoveSelectedRepoFromOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsRemoveSelectedRepoFromOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint extends js.Object {
  var parameters: ActionsRemoveSelectedRepoFromOrgSecretEndpoint = js.native
  var request: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsRemoveSelectedRepoFromOrgSecretEndpoint,
    request: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsRemoveSelectedRepoFromOrgSecretEndpointOps[Self <: ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsRemoveSelectedRepoFromOrgSecretEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

