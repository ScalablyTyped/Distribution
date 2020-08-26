package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateCommitStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitStatusRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateCommitStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposCreateCommitStatusEndpoint extends js.Object {
  var parameters: ReposCreateCommitStatusEndpoint = js.native
  var request: ReposCreateCommitStatusRequestOptions = js.native
  var response: OctokitResponse[ReposCreateCommitStatusResponseData] = js.native
}

object ParametersReposCreateCommitStatusEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateCommitStatusEndpoint,
    request: ReposCreateCommitStatusRequestOptions,
    response: OctokitResponse[ReposCreateCommitStatusResponseData]
  ): ParametersReposCreateCommitStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateCommitStatusEndpoint]
  }
  @scala.inline
  implicit class ParametersReposCreateCommitStatusEndpointOps[Self <: ParametersReposCreateCommitStatusEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposCreateCommitStatusEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposCreateCommitStatusRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitStatusResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

