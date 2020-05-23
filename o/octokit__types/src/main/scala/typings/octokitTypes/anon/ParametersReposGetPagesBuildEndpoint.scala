package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPagesBuildRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetPagesBuildEndpoint extends js.Object {
  var parameters: ReposGetPagesBuildEndpoint
  var request: ReposGetPagesBuildRequestOptions
  var response: OctokitResponse[ReposGetPagesBuildResponseData]
}

object ParametersReposGetPagesBuildEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetPagesBuildEndpoint,
    request: ReposGetPagesBuildRequestOptions,
    response: OctokitResponse[ReposGetPagesBuildResponseData]
  ): ParametersReposGetPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPagesBuildEndpoint]
  }
}

