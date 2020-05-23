package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsUpdateEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `798` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsUpdateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsUpdateResponseData]
}

object `798` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsUpdateResponseData]
  ): `798` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`798`]
  }
}

