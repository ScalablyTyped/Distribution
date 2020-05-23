package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListPublicEventsEndpoint
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `591` extends js.Object {
  var parameters: RequestParameters with (Omit[ActivityListPublicEventsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[_]
}

object `591` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityListPublicEventsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[_]
  ): `591` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`591`]
  }
}

