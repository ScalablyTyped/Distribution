package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetTeamAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetTeamAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetTeamAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposSetTeamAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposSetTeamAccessRestrictionsEndpoint
  var request: ReposSetTeamAccessRestrictionsRequestOptions
  var response: OctokitResponse[ReposSetTeamAccessRestrictionsResponseData]
}

object ParametersReposSetTeamAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposSetTeamAccessRestrictionsEndpoint,
    request: ReposSetTeamAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposSetTeamAccessRestrictionsResponseData]
  ): ParametersReposSetTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetTeamAccessRestrictionsEndpoint]
  }
}

