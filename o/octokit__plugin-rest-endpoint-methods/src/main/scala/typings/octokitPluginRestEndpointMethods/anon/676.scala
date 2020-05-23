package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsUpdateEndpoint
import typings.octokitTypes.endpointsMod.GistsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `676` extends js.Object {
  var parameters: RequestParameters with (Omit[GistsUpdateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GistsUpdateResponseData]
}

object `676` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsUpdateResponseData]
  ): `676` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`676`]
  }
}

