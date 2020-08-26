package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateBranchEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateBranchRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsUpdateBranchEndpoint extends js.Object {
  var parameters: PullsUpdateBranchEndpoint = js.native
  var request: PullsUpdateBranchRequestOptions = js.native
  var response: OctokitResponse[PullsUpdateBranchResponseData] = js.native
}

object ParametersPullsUpdateBranchEndpoint {
  @scala.inline
  def apply(
    parameters: PullsUpdateBranchEndpoint,
    request: PullsUpdateBranchRequestOptions,
    response: OctokitResponse[PullsUpdateBranchResponseData]
  ): ParametersPullsUpdateBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateBranchEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsUpdateBranchEndpointOps[Self <: ParametersPullsUpdateBranchEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsUpdateBranchEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: PullsUpdateBranchRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateBranchResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

