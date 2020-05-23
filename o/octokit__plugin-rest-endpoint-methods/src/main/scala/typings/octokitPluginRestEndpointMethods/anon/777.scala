package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsGetHookEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetHookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `777` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsGetHookEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsGetHookResponseData]
}

object `777` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsGetHookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsGetHookResponseData]
  ): `777` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`777`]
  }
}

