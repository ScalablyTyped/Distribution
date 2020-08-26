package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListContributorsEndpoint
import typings.octokitTypes.endpointsMod.ReposListContributorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListContributorsEndpoint extends js.Object {
  var parameters: ReposListContributorsEndpoint = js.native
  var response: OctokitResponse[ReposListContributorsResponseData] = js.native
}

object ParametersReposListContributorsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListContributorsEndpoint,
    response: OctokitResponse[ReposListContributorsResponseData]
  ): ParametersReposListContributorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListContributorsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListContributorsEndpointOps[Self <: ParametersReposListContributorsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListContributorsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListContributorsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

