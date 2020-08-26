package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsListArtifactsForRepoEndpoint extends js.Object {
  var parameters: ActionsListArtifactsForRepoEndpoint = js.native
  var request: ActionsListArtifactsForRepoRequestOptions = js.native
  var response: OctokitResponse[ActionsListArtifactsForRepoResponseData] = js.native
}

object ParametersActionsListArtifactsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListArtifactsForRepoEndpoint,
    request: ActionsListArtifactsForRepoRequestOptions,
    response: OctokitResponse[ActionsListArtifactsForRepoResponseData]
  ): ParametersActionsListArtifactsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListArtifactsForRepoEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsListArtifactsForRepoEndpointOps[Self <: ParametersActionsListArtifactsForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsListArtifactsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsListArtifactsForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListArtifactsForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

