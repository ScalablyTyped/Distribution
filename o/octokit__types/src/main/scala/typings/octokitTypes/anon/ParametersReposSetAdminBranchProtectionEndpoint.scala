package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposSetAdminBranchProtectionEndpoint extends js.Object {
  var parameters: ReposSetAdminBranchProtectionEndpoint = js.native
  var request: ReposSetAdminBranchProtectionRequestOptions = js.native
  var response: OctokitResponse[ReposSetAdminBranchProtectionResponseData] = js.native
}

object ParametersReposSetAdminBranchProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposSetAdminBranchProtectionEndpoint,
    request: ReposSetAdminBranchProtectionRequestOptions,
    response: OctokitResponse[ReposSetAdminBranchProtectionResponseData]
  ): ParametersReposSetAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetAdminBranchProtectionEndpoint]
  }
  @scala.inline
  implicit class ParametersReposSetAdminBranchProtectionEndpointOps[Self <: ParametersReposSetAdminBranchProtectionEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposSetAdminBranchProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposSetAdminBranchProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetAdminBranchProtectionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

