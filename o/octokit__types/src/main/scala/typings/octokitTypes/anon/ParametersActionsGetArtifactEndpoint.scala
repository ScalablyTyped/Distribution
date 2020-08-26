package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetArtifactEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetArtifactRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetArtifactResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsGetArtifactEndpoint extends js.Object {
  var parameters: ActionsGetArtifactEndpoint = js.native
  var request: ActionsGetArtifactRequestOptions = js.native
  var response: OctokitResponse[ActionsGetArtifactResponseData] = js.native
}

object ParametersActionsGetArtifactEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetArtifactEndpoint,
    request: ActionsGetArtifactRequestOptions,
    response: OctokitResponse[ActionsGetArtifactResponseData]
  ): ParametersActionsGetArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetArtifactEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsGetArtifactEndpointOps[Self <: ParametersActionsGetArtifactEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsGetArtifactEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsGetArtifactRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetArtifactResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

