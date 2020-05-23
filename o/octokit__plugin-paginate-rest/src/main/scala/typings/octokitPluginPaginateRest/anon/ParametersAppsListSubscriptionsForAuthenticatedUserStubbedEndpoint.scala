package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint extends js.Object {
  var parameters: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint
  var response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]
}

object ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint,
    response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]
  ): ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint]
  }
}

