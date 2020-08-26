package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetViewsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetViewsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetViewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetViewsEndpoint extends js.Object {
  var parameters: ReposGetViewsEndpoint = js.native
  var request: ReposGetViewsRequestOptions = js.native
  var response: OctokitResponse[ReposGetViewsResponseData] = js.native
}

object ParametersReposGetViewsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetViewsEndpoint,
    request: ReposGetViewsRequestOptions,
    response: OctokitResponse[ReposGetViewsResponseData]
  ): ParametersReposGetViewsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetViewsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetViewsEndpointOps[Self <: ParametersReposGetViewsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetViewsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetViewsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetViewsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

