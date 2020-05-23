package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetReleaseByTagEndpoint extends js.Object {
  var parameters: ReposGetReleaseByTagEndpoint
  var request: ReposGetReleaseByTagRequestOptions
  var response: OctokitResponse[ReposGetReleaseByTagResponseData]
}

object ParametersReposGetReleaseByTagEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetReleaseByTagEndpoint,
    request: ReposGetReleaseByTagRequestOptions,
    response: OctokitResponse[ReposGetReleaseByTagResponseData]
  ): ParametersReposGetReleaseByTagEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseByTagEndpoint]
  }
}

