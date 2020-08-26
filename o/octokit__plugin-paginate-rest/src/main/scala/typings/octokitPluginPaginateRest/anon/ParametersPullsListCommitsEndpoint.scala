package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListCommitsEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsListCommitsEndpoint extends js.Object {
  var parameters: PullsListCommitsEndpoint = js.native
  var response: OctokitResponse[PullsListCommitsResponseData] = js.native
}

object ParametersPullsListCommitsEndpoint {
  @scala.inline
  def apply(parameters: PullsListCommitsEndpoint, response: OctokitResponse[PullsListCommitsResponseData]): ParametersPullsListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommitsEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsListCommitsEndpointOps[Self <: ParametersPullsListCommitsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsListCommitsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListCommitsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

