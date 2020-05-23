package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListPagesBuildsEndpoint
import typings.octokitTypes.endpointsMod.ReposListPagesBuildsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `973` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListPagesBuildsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListPagesBuildsResponseData]
}

object `973` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListPagesBuildsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListPagesBuildsResponseData]
  ): `973` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`973`]
  }
}

