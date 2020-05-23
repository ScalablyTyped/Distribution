package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListReposEndpoint
import typings.octokitTypes.endpointsMod.AppsListReposResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListReposEndpoint extends js.Object {
  var parameters: AppsListReposEndpoint
  var response: OctokitResponse[AppsListReposResponseData] with Data
}

object ParametersAppsListReposEndpoint {
  @scala.inline
  def apply(parameters: AppsListReposEndpoint, response: OctokitResponse[AppsListReposResponseData] with Data): ParametersAppsListReposEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListReposEndpoint]
  }
}

