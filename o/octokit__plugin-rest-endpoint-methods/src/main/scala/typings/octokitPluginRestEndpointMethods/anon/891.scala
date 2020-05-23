package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateHookEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateHookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `891` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateHookEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposCreateHookResponseData]
}

object `891` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateHookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateHookResponseData]
  ): `891` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`891`]
  }
}

