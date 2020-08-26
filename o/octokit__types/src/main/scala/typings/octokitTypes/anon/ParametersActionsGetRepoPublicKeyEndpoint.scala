package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsGetRepoPublicKeyEndpoint extends js.Object {
  var parameters: ActionsGetRepoPublicKeyEndpoint = js.native
  var request: ActionsGetRepoPublicKeyRequestOptions = js.native
  var response: OctokitResponse[ActionsGetRepoPublicKeyResponseData] = js.native
}

object ParametersActionsGetRepoPublicKeyEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetRepoPublicKeyEndpoint,
    request: ActionsGetRepoPublicKeyRequestOptions,
    response: OctokitResponse[ActionsGetRepoPublicKeyResponseData]
  ): ParametersActionsGetRepoPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetRepoPublicKeyEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsGetRepoPublicKeyEndpointOps[Self <: ParametersActionsGetRepoPublicKeyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsGetRepoPublicKeyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsGetRepoPublicKeyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetRepoPublicKeyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

