package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildRequestOptions
import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRequestPagesBuildEndpoint extends js.Object {
  var parameters: ReposRequestPagesBuildEndpoint
  var request: ReposRequestPagesBuildRequestOptions
  var response: OctokitResponse[ReposRequestPagesBuildResponseData]
}

object ParametersReposRequestPagesBuildEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRequestPagesBuildEndpoint,
    request: ReposRequestPagesBuildRequestOptions,
    response: OctokitResponse[ReposRequestPagesBuildResponseData]
  ): ParametersReposRequestPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRequestPagesBuildEndpoint]
  }
}

