package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanEndpoint
import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `626` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsListAccountsForPlanEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsListAccountsForPlanResponseData]
}

object `626` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListAccountsForPlanEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListAccountsForPlanResponseData]
  ): `626` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`626`]
  }
}

