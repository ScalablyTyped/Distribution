package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteDeploymentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposDeleteDeploymentEndpoint extends js.Object {
  var parameters: ReposDeleteDeploymentEndpoint = js.native
  var request: ReposDeleteDeploymentRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersReposDeleteDeploymentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteDeploymentEndpoint,
    request: ReposDeleteDeploymentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteDeploymentEndpoint]
  }
  @scala.inline
  implicit class ParametersReposDeleteDeploymentEndpointOps[Self <: ParametersReposDeleteDeploymentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposDeleteDeploymentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposDeleteDeploymentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

