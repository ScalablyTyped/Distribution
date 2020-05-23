package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListForAuthenticatedUserEndpoint extends js.Object {
  var parameters: IssuesListForAuthenticatedUserEndpoint
  var response: OctokitResponse[IssuesListForAuthenticatedUserResponseData]
}

object ParametersIssuesListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListForAuthenticatedUserEndpoint,
    response: OctokitResponse[IssuesListForAuthenticatedUserResponseData]
  ): ParametersIssuesListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForAuthenticatedUserEndpoint]
  }
}

