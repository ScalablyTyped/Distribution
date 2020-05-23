package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetBySlugEndpoint
import typings.octokitTypes.endpointsMod.AppsGetBySlugRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetBySlugResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsGetBySlugEndpoint extends js.Object {
  var parameters: AppsGetBySlugEndpoint
  var request: AppsGetBySlugRequestOptions
  var response: OctokitResponse[AppsGetBySlugResponseData]
}

object ParametersAppsGetBySlugEndpoint {
  @scala.inline
  def apply(
    parameters: AppsGetBySlugEndpoint,
    request: AppsGetBySlugRequestOptions,
    response: OctokitResponse[AppsGetBySlugResponseData]
  ): ParametersAppsGetBySlugEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetBySlugEndpoint]
  }
}

