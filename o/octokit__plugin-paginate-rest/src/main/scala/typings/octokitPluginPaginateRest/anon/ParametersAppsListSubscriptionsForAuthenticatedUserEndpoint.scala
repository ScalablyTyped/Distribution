package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: AppsListSubscriptionsForAuthenticatedUserEndpoint
  var response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData]
}

object ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListSubscriptionsForAuthenticatedUserEndpoint,
    response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData]
  ): ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint]
  }
}

