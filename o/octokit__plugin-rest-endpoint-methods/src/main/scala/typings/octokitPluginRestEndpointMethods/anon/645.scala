package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksListAnnotationsEndpoint
import typings.octokitTypes.endpointsMod.ChecksListAnnotationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `645` extends js.Object {
  var parameters: RequestParameters with (Omit[ChecksListAnnotationsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ChecksListAnnotationsResponseData]
}

object `645` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksListAnnotationsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksListAnnotationsResponseData]
  ): `645` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`645`]
  }
}

