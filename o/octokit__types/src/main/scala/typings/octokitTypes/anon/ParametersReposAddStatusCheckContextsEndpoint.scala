package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposAddStatusCheckContextsEndpoint extends js.Object {
  var parameters: ReposAddStatusCheckContextsEndpoint = js.native
  var request: ReposAddStatusCheckContextsRequestOptions = js.native
  var response: OctokitResponse[ReposAddStatusCheckContextsResponseData] = js.native
}

object ParametersReposAddStatusCheckContextsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddStatusCheckContextsEndpoint,
    request: ReposAddStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
  ): ParametersReposAddStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddStatusCheckContextsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposAddStatusCheckContextsEndpointOps[Self <: ParametersReposAddStatusCheckContextsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposAddStatusCheckContextsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposAddStatusCheckContextsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddStatusCheckContextsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

