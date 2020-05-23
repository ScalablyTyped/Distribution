package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListPlansStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListPlansStubbedEndpoint extends js.Object {
  var parameters: AppsListPlansStubbedEndpoint
  var response: OctokitResponse[AppsListPlansStubbedResponseData]
}

object ParametersAppsListPlansStubbedEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListPlansStubbedEndpoint,
    response: OctokitResponse[AppsListPlansStubbedResponseData]
  ): ParametersAppsListPlansStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListPlansStubbedEndpoint]
  }
}

