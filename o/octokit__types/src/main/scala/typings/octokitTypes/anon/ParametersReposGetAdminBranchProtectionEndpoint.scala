package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetAdminBranchProtectionEndpoint extends js.Object {
  var parameters: ReposGetAdminBranchProtectionEndpoint = js.native
  var request: ReposGetAdminBranchProtectionRequestOptions = js.native
  var response: OctokitResponse[ReposGetAdminBranchProtectionResponseData] = js.native
}

object ParametersReposGetAdminBranchProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetAdminBranchProtectionEndpoint,
    request: ReposGetAdminBranchProtectionRequestOptions,
    response: OctokitResponse[ReposGetAdminBranchProtectionResponseData]
  ): ParametersReposGetAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAdminBranchProtectionEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetAdminBranchProtectionEndpointOps[Self <: ParametersReposGetAdminBranchProtectionEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetAdminBranchProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetAdminBranchProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAdminBranchProtectionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

