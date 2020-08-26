package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetReleaseByTagEndpoint extends js.Object {
  var parameters: ReposGetReleaseByTagEndpoint = js.native
  var request: ReposGetReleaseByTagRequestOptions = js.native
  var response: OctokitResponse[ReposGetReleaseByTagResponseData] = js.native
}

object ParametersReposGetReleaseByTagEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetReleaseByTagEndpoint,
    request: ReposGetReleaseByTagRequestOptions,
    response: OctokitResponse[ReposGetReleaseByTagResponseData]
  ): ParametersReposGetReleaseByTagEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseByTagEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetReleaseByTagEndpointOps[Self <: ParametersReposGetReleaseByTagEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetReleaseByTagEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetReleaseByTagRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReleaseByTagResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

