package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListMilestonesEndpoint
import typings.octokitTypes.endpointsMod.IssuesListMilestonesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesListMilestonesEndpoint extends js.Object {
  var parameters: IssuesListMilestonesEndpoint = js.native
  var response: OctokitResponse[IssuesListMilestonesResponseData] = js.native
}

object ParametersIssuesListMilestonesEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListMilestonesEndpoint,
    response: OctokitResponse[IssuesListMilestonesResponseData]
  ): ParametersIssuesListMilestonesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListMilestonesEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesListMilestonesEndpointOps[Self <: ParametersIssuesListMilestonesEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesListMilestonesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListMilestonesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

