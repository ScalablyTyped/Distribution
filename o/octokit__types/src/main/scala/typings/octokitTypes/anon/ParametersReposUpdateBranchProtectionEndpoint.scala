package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposUpdateBranchProtectionEndpoint extends js.Object {
  var parameters: ReposUpdateBranchProtectionEndpoint = js.native
  var request: ReposUpdateBranchProtectionRequestOptions = js.native
  var response: OctokitResponse[ReposUpdateBranchProtectionResponseData] = js.native
}

object ParametersReposUpdateBranchProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateBranchProtectionEndpoint,
    request: ReposUpdateBranchProtectionRequestOptions,
    response: OctokitResponse[ReposUpdateBranchProtectionResponseData]
  ): ParametersReposUpdateBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateBranchProtectionEndpoint]
  }
  @scala.inline
  implicit class ParametersReposUpdateBranchProtectionEndpointOps[Self <: ParametersReposUpdateBranchProtectionEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposUpdateBranchProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposUpdateBranchProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateBranchProtectionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

