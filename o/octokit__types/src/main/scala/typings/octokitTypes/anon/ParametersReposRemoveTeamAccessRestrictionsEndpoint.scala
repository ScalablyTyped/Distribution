package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveTeamAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveTeamAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveTeamAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveTeamAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposRemoveTeamAccessRestrictionsEndpoint
  var request: ReposRemoveTeamAccessRestrictionsRequestOptions
  var response: OctokitResponse[ReposRemoveTeamAccessRestrictionsResponseData]
}

object ParametersReposRemoveTeamAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveTeamAccessRestrictionsEndpoint,
    request: ReposRemoveTeamAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveTeamAccessRestrictionsResponseData]
  ): ParametersReposRemoveTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveTeamAccessRestrictionsEndpoint]
  }
}

