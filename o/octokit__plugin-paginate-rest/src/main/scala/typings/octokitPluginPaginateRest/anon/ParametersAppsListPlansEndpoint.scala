package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListPlansEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListPlansEndpoint extends js.Object {
  var parameters: AppsListPlansEndpoint
  var response: OctokitResponse[AppsListPlansResponseData]
}

object ParametersAppsListPlansEndpoint {
  @scala.inline
  def apply(parameters: AppsListPlansEndpoint, response: OctokitResponse[AppsListPlansResponseData]): ParametersAppsListPlansEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListPlansEndpoint]
  }
}

