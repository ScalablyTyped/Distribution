package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsUpdateHookEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateHookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `799` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsUpdateHookEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsUpdateHookResponseData]
}

object `799` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsUpdateHookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsUpdateHookResponseData]
  ): `799` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`799`]
  }
}

