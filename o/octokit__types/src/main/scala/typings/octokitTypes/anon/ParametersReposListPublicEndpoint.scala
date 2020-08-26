package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListPublicEndpoint
import typings.octokitTypes.endpointsMod.ReposListPublicRequestOptions
import typings.octokitTypes.endpointsMod.ReposListPublicResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListPublicEndpoint extends js.Object {
  var parameters: ReposListPublicEndpoint = js.native
  var request: ReposListPublicRequestOptions = js.native
  var response: OctokitResponse[ReposListPublicResponseData] = js.native
}

object ParametersReposListPublicEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListPublicEndpoint,
    request: ReposListPublicRequestOptions,
    response: OctokitResponse[ReposListPublicResponseData]
  ): ParametersReposListPublicEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPublicEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListPublicEndpointOps[Self <: ParametersReposListPublicEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListPublicEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposListPublicRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListPublicResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

