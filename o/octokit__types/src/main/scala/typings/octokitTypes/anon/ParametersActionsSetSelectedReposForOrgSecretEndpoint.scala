package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsSetSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsSetSelectedReposForOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsSetSelectedReposForOrgSecretEndpoint extends js.Object {
  var parameters: ActionsSetSelectedReposForOrgSecretEndpoint = js.native
  var request: ActionsSetSelectedReposForOrgSecretRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersActionsSetSelectedReposForOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsSetSelectedReposForOrgSecretEndpoint,
    request: ActionsSetSelectedReposForOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsSetSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsSetSelectedReposForOrgSecretEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsSetSelectedReposForOrgSecretEndpointOps[Self <: ParametersActionsSetSelectedReposForOrgSecretEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsSetSelectedReposForOrgSecretEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsSetSelectedReposForOrgSecretRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

