package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeploymentRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetDeploymentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetDeploymentEndpoint extends js.Object {
  var parameters: ReposGetDeploymentEndpoint = js.native
  var request: ReposGetDeploymentRequestOptions = js.native
  var response: OctokitResponse[ReposGetDeploymentResponseData] = js.native
}

object ParametersReposGetDeploymentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetDeploymentEndpoint,
    request: ReposGetDeploymentRequestOptions,
    response: OctokitResponse[ReposGetDeploymentResponseData]
  ): ParametersReposGetDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDeploymentEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetDeploymentEndpointOps[Self <: ParametersReposGetDeploymentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetDeploymentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetDeploymentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetDeploymentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

