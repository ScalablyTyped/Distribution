package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesListAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesListAssigneesEndpoint extends js.Object {
  var parameters: IssuesListAssigneesEndpoint = js.native
  var response: OctokitResponse[IssuesListAssigneesResponseData] = js.native
}

object ParametersIssuesListAssigneesEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListAssigneesEndpoint,
    response: OctokitResponse[IssuesListAssigneesResponseData]
  ): ParametersIssuesListAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListAssigneesEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesListAssigneesEndpointOps[Self <: ParametersIssuesListAssigneesEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesListAssigneesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListAssigneesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

