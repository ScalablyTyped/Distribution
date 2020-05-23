package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRequestPageBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposRequestPageBuildRequestOptions
import typings.octokitTypes.endpointsMod.ReposRequestPageBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRequestPageBuildEndpoint extends js.Object {
  var parameters: ReposRequestPageBuildEndpoint
  var request: ReposRequestPageBuildRequestOptions
  var response: OctokitResponse[ReposRequestPageBuildResponseData]
}

object ParametersReposRequestPageBuildEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRequestPageBuildEndpoint,
    request: ReposRequestPageBuildRequestOptions,
    response: OctokitResponse[ReposRequestPageBuildResponseData]
  ): ParametersReposRequestPageBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRequestPageBuildEndpoint]
  }
}

