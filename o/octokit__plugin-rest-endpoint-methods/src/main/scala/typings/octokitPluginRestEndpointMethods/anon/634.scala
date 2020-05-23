package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsListPlansStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `634` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsListPlansStubbedEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsListPlansStubbedResponseData]
}

object `634` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListPlansStubbedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListPlansStubbedResponseData]
  ): `634` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`634`]
  }
}

