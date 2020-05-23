package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetLatestPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposGetLatestPagesBuildRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetLatestPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetLatestPagesBuildEndpoint extends js.Object {
  var parameters: ReposGetLatestPagesBuildEndpoint
  var request: ReposGetLatestPagesBuildRequestOptions
  var response: OctokitResponse[ReposGetLatestPagesBuildResponseData]
}

object ParametersReposGetLatestPagesBuildEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetLatestPagesBuildEndpoint,
    request: ReposGetLatestPagesBuildRequestOptions,
    response: OctokitResponse[ReposGetLatestPagesBuildResponseData]
  ): ParametersReposGetLatestPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetLatestPagesBuildEndpoint]
  }
}

