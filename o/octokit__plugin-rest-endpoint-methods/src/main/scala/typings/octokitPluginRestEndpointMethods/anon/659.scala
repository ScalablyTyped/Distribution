package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsCreateEndpoint
import typings.octokitTypes.endpointsMod.GistsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `659` extends js.Object {
  var parameters: RequestParameters with (Omit[GistsCreateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GistsCreateResponseData]
}

object `659` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsCreateResponseData]
  ): `659` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`659`]
  }
}

