package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListTeamsEndpoint
import typings.octokitTypes.endpointsMod.ReposListTeamsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `987` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListTeamsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListTeamsResponseData]
}

object `987` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListTeamsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListTeamsResponseData]
  ): `987` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`987`]
  }
}

