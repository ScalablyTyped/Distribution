package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsCreateRemoveTokenForRepoEndpoint extends js.Object {
  var parameters: ActionsCreateRemoveTokenForRepoEndpoint = js.native
  var request: ActionsCreateRemoveTokenForRepoRequestOptions = js.native
  var response: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData] = js.native
}

object ParametersActionsCreateRemoveTokenForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsCreateRemoveTokenForRepoEndpoint,
    request: ActionsCreateRemoveTokenForRepoRequestOptions,
    response: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]
  ): ParametersActionsCreateRemoveTokenForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRemoveTokenForRepoEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsCreateRemoveTokenForRepoEndpointOps[Self <: ParametersActionsCreateRemoveTokenForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsCreateRemoveTokenForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsCreateRemoveTokenForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

