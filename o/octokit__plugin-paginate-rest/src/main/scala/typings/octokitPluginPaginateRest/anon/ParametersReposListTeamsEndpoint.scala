package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListTeamsEndpoint
import typings.octokitTypes.endpointsMod.ReposListTeamsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListTeamsEndpoint extends js.Object {
  var parameters: ReposListTeamsEndpoint = js.native
  var response: OctokitResponse[ReposListTeamsResponseData] = js.native
}

object ParametersReposListTeamsEndpoint {
  @scala.inline
  def apply(parameters: ReposListTeamsEndpoint, response: OctokitResponse[ReposListTeamsResponseData]): ParametersReposListTeamsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListTeamsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListTeamsEndpointOps[Self <: ParametersReposListTeamsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListTeamsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListTeamsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

