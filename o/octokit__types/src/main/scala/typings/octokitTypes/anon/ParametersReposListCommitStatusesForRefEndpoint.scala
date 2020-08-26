package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListCommitStatusesForRefEndpoint extends js.Object {
  var parameters: ReposListCommitStatusesForRefEndpoint = js.native
  var request: ReposListCommitStatusesForRefRequestOptions = js.native
  var response: OctokitResponse[ReposListCommitStatusesForRefResponseData] = js.native
}

object ParametersReposListCommitStatusesForRefEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListCommitStatusesForRefEndpoint,
    request: ReposListCommitStatusesForRefRequestOptions,
    response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
  ): ParametersReposListCommitStatusesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitStatusesForRefEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListCommitStatusesForRefEndpointOps[Self <: ParametersReposListCommitStatusesForRefEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListCommitStatusesForRefEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposListCommitStatusesForRefRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommitStatusesForRefResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

