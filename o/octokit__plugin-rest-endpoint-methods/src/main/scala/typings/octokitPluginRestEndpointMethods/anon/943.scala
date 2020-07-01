package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposGetWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `943` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetWebhookEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetWebhookResponseData]
}

object `943` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetWebhookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetWebhookResponseData]
  ): `943` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`943`]
  }
}

