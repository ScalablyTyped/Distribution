package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListBranchesEndpoint
import typings.octokitTypes.endpointsMod.ReposListBranchesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListBranchesEndpoint extends js.Object {
  var parameters: ReposListBranchesEndpoint = js.native
  var response: OctokitResponse[ReposListBranchesResponseData] = js.native
}

object ParametersReposListBranchesEndpoint {
  @scala.inline
  def apply(parameters: ReposListBranchesEndpoint, response: OctokitResponse[ReposListBranchesResponseData]): ParametersReposListBranchesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListBranchesEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListBranchesEndpointOps[Self <: ParametersReposListBranchesEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListBranchesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListBranchesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

