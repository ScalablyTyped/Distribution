package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsGetEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `776` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsGetEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsGetResponseData]
}

object `776` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsGetResponseData]
  ): `776` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`776`]
  }
}

