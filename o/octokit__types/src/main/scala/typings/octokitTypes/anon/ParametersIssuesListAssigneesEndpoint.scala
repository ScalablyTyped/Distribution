package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesListAssigneesRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListAssigneesEndpoint extends js.Object {
  var parameters: IssuesListAssigneesEndpoint
  var request: IssuesListAssigneesRequestOptions
  var response: OctokitResponse[IssuesListAssigneesResponseData]
}

object ParametersIssuesListAssigneesEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListAssigneesEndpoint,
    request: IssuesListAssigneesRequestOptions,
    response: OctokitResponse[IssuesListAssigneesResponseData]
  ): ParametersIssuesListAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListAssigneesEndpoint]
  }
}

