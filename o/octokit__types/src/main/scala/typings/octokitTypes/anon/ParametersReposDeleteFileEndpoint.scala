package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteFileEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteFileRequestOptions
import typings.octokitTypes.endpointsMod.ReposDeleteFileResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposDeleteFileEndpoint extends js.Object {
  var parameters: ReposDeleteFileEndpoint = js.native
  var request: ReposDeleteFileRequestOptions = js.native
  var response: OctokitResponse[ReposDeleteFileResponseData] = js.native
}

object ParametersReposDeleteFileEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteFileEndpoint,
    request: ReposDeleteFileRequestOptions,
    response: OctokitResponse[ReposDeleteFileResponseData]
  ): ParametersReposDeleteFileEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteFileEndpoint]
  }
  @scala.inline
  implicit class ParametersReposDeleteFileEndpointOps[Self <: ParametersReposDeleteFileEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposDeleteFileEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposDeleteFileRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposDeleteFileResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

