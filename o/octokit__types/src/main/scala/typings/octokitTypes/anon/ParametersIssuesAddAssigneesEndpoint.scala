package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesAddAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesAddAssigneesRequestOptions
import typings.octokitTypes.endpointsMod.IssuesAddAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesAddAssigneesEndpoint extends js.Object {
  var parameters: IssuesAddAssigneesEndpoint
  var request: IssuesAddAssigneesRequestOptions
  var response: OctokitResponse[IssuesAddAssigneesResponseData]
}

object ParametersIssuesAddAssigneesEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesAddAssigneesEndpoint,
    request: IssuesAddAssigneesRequestOptions,
    response: OctokitResponse[IssuesAddAssigneesResponseData]
  ): ParametersIssuesAddAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesAddAssigneesEndpoint]
  }
}

