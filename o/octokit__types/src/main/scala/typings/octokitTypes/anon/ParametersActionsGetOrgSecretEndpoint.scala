package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsGetOrgSecretEndpoint extends js.Object {
  var parameters: ActionsGetOrgSecretEndpoint = js.native
  var request: ActionsGetOrgSecretRequestOptions = js.native
  var response: OctokitResponse[ActionsGetOrgSecretResponseData] = js.native
}

object ParametersActionsGetOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetOrgSecretEndpoint,
    request: ActionsGetOrgSecretRequestOptions,
    response: OctokitResponse[ActionsGetOrgSecretResponseData]
  ): ParametersActionsGetOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetOrgSecretEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsGetOrgSecretEndpointOps[Self <: ParametersActionsGetOrgSecretEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsGetOrgSecretEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsGetOrgSecretRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetOrgSecretResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

