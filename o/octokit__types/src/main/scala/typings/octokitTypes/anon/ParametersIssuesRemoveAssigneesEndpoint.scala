package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesRemoveAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveAssigneesRequestOptions
import typings.octokitTypes.endpointsMod.IssuesRemoveAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesRemoveAssigneesEndpoint extends js.Object {
  var parameters: IssuesRemoveAssigneesEndpoint
  var request: IssuesRemoveAssigneesRequestOptions
  var response: OctokitResponse[IssuesRemoveAssigneesResponseData]
}

object ParametersIssuesRemoveAssigneesEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesRemoveAssigneesEndpoint,
    request: IssuesRemoveAssigneesRequestOptions,
    response: OctokitResponse[IssuesRemoveAssigneesResponseData]
  ): ParametersIssuesRemoveAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesRemoveAssigneesEndpoint]
  }
}

