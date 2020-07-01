package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsCreateWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsCreateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `773` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsCreateWebhookEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsCreateWebhookResponseData]
}

object `773` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsCreateWebhookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsCreateWebhookResponseData]
  ): `773` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`773`]
  }
}

