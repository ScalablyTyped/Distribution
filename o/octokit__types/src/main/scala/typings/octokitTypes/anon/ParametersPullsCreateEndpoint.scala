package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsCreateEndpoint extends js.Object {
  var parameters: PullsCreateEndpoint = js.native
  var request: PullsCreateRequestOptions = js.native
  var response: OctokitResponse[PullsCreateResponseData] = js.native
}

object ParametersPullsCreateEndpoint {
  @scala.inline
  def apply(
    parameters: PullsCreateEndpoint,
    request: PullsCreateRequestOptions,
    response: OctokitResponse[PullsCreateResponseData]
  ): ParametersPullsCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsCreateEndpointOps[Self <: ParametersPullsCreateEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsCreateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: PullsCreateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[PullsCreateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

