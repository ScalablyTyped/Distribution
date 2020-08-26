package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListDeploymentsEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeploymentsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListDeploymentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListDeploymentsEndpoint extends js.Object {
  var parameters: ReposListDeploymentsEndpoint = js.native
  var request: ReposListDeploymentsRequestOptions = js.native
  var response: OctokitResponse[ReposListDeploymentsResponseData] = js.native
}

object ParametersReposListDeploymentsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListDeploymentsEndpoint,
    request: ReposListDeploymentsRequestOptions,
    response: OctokitResponse[ReposListDeploymentsResponseData]
  ): ParametersReposListDeploymentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeploymentsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListDeploymentsEndpointOps[Self <: ParametersReposListDeploymentsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListDeploymentsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposListDeploymentsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListDeploymentsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

