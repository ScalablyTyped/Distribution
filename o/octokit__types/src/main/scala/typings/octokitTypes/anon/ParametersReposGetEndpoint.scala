package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetEndpoint
import typings.octokitTypes.endpointsMod.ReposGetRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetEndpoint extends js.Object {
  var parameters: ReposGetEndpoint = js.native
  var request: ReposGetRequestOptions = js.native
  var response: OctokitResponse[ReposGetResponseData] = js.native
}

object ParametersReposGetEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetEndpoint,
    request: ReposGetRequestOptions,
    response: OctokitResponse[ReposGetResponseData]
  ): ParametersReposGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetEndpointOps[Self <: ParametersReposGetEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

