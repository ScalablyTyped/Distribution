package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListLabelsForRepoEndpoint extends js.Object {
  var parameters: IssuesListLabelsForRepoEndpoint
  var response: OctokitResponse[IssuesListLabelsForRepoResponseData]
}

object ParametersIssuesListLabelsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListLabelsForRepoEndpoint,
    response: OctokitResponse[IssuesListLabelsForRepoResponseData]
  ): ParametersIssuesListLabelsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListLabelsForRepoEndpoint]
  }
}

