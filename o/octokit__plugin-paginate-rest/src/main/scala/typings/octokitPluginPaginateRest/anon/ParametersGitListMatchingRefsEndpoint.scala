package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GitListMatchingRefsEndpoint
import typings.octokitTypes.endpointsMod.GitListMatchingRefsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitListMatchingRefsEndpoint extends js.Object {
  var parameters: GitListMatchingRefsEndpoint
  var response: OctokitResponse[GitListMatchingRefsResponseData]
}

object ParametersGitListMatchingRefsEndpoint {
  @scala.inline
  def apply(
    parameters: GitListMatchingRefsEndpoint,
    response: OctokitResponse[GitListMatchingRefsResponseData]
  ): ParametersGitListMatchingRefsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitListMatchingRefsEndpoint]
  }
}

