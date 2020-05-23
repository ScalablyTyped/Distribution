package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.RateLimitGetEndpoint
import typings.octokitTypes.endpointsMod.RateLimitGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `853` extends js.Object {
  var parameters: RequestParameters with (Omit[RateLimitGetEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[RateLimitGetResponseData]
}

object `853` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[RateLimitGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[RateLimitGetResponseData]
  ): `853` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`853`]
  }
}

