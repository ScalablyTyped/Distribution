package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetHookEndpoint
import typings.octokitTypes.endpointsMod.ReposGetHookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `932` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetHookEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetHookResponseData]
}

object `932` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetHookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetHookResponseData]
  ): `932` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`932`]
  }
}

