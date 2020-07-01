package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddTeamAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddTeamAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddTeamAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddTeamAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposAddTeamAccessRestrictionsEndpoint
  var request: ReposAddTeamAccessRestrictionsRequestOptions
  var response: OctokitResponse[ReposAddTeamAccessRestrictionsResponseData]
}

object ParametersReposAddTeamAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddTeamAccessRestrictionsEndpoint,
    request: ReposAddTeamAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddTeamAccessRestrictionsResponseData]
  ): ParametersReposAddTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddTeamAccessRestrictionsEndpoint]
  }
}

