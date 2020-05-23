package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListPlansEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansRequestOptions
import typings.octokitTypes.endpointsMod.AppsListPlansResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListPlansEndpoint extends js.Object {
  var parameters: AppsListPlansEndpoint
  var request: AppsListPlansRequestOptions
  var response: OctokitResponse[AppsListPlansResponseData]
}

object ParametersAppsListPlansEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListPlansEndpoint,
    request: AppsListPlansRequestOptions,
    response: OctokitResponse[AppsListPlansResponseData]
  ): ParametersAppsListPlansEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListPlansEndpoint]
  }
}

