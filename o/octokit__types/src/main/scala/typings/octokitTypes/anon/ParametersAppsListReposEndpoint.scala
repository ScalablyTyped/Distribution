package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListReposEndpoint
import typings.octokitTypes.endpointsMod.AppsListReposRequestOptions
import typings.octokitTypes.endpointsMod.AppsListReposResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListReposEndpoint extends js.Object {
  var parameters: AppsListReposEndpoint
  var request: AppsListReposRequestOptions
  var response: OctokitResponse[AppsListReposResponseData]
}

object ParametersAppsListReposEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListReposEndpoint,
    request: AppsListReposRequestOptions,
    response: OctokitResponse[AppsListReposResponseData]
  ): ParametersAppsListReposEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListReposEndpoint]
  }
}

