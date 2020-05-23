package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsGetCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsGetCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `665` extends js.Object {
  var parameters: RequestParameters with (Omit[GistsGetCommentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GistsGetCommentResponseData]
}

object `665` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsGetCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsGetCommentResponseData]
  ): `665` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`665`]
  }
}

