package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReadmeEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReadmeRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReadmeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetReadmeEndpoint extends js.Object {
  var parameters: ReposGetReadmeEndpoint = js.native
  var request: ReposGetReadmeRequestOptions = js.native
  var response: OctokitResponse[ReposGetReadmeResponseData] = js.native
}

object ParametersReposGetReadmeEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetReadmeEndpoint,
    request: ReposGetReadmeRequestOptions,
    response: OctokitResponse[ReposGetReadmeResponseData]
  ): ParametersReposGetReadmeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReadmeEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetReadmeEndpointOps[Self <: ParametersReposGetReadmeEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetReadmeEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetReadmeRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReadmeResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

