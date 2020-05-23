package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanEndpoint
import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanRequestOptions
import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListAccountsForPlanEndpoint extends js.Object {
  var parameters: AppsListAccountsForPlanEndpoint
  var request: AppsListAccountsForPlanRequestOptions
  var response: OctokitResponse[AppsListAccountsForPlanResponseData]
}

object ParametersAppsListAccountsForPlanEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListAccountsForPlanEndpoint,
    request: AppsListAccountsForPlanRequestOptions,
    response: OctokitResponse[AppsListAccountsForPlanResponseData]
  ): ParametersAppsListAccountsForPlanEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListAccountsForPlanEndpoint]
  }
}

