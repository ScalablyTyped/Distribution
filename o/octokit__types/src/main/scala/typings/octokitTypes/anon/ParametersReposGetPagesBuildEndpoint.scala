package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPagesBuildRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetPagesBuildEndpoint extends js.Object {
  var parameters: ReposGetPagesBuildEndpoint = js.native
  var request: ReposGetPagesBuildRequestOptions = js.native
  var response: OctokitResponse[ReposGetPagesBuildResponseData] = js.native
}

object ParametersReposGetPagesBuildEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetPagesBuildEndpoint,
    request: ReposGetPagesBuildRequestOptions,
    response: OctokitResponse[ReposGetPagesBuildResponseData]
  ): ParametersReposGetPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPagesBuildEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetPagesBuildEndpointOps[Self <: ParametersReposGetPagesBuildEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetPagesBuildEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetPagesBuildRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPagesBuildResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

