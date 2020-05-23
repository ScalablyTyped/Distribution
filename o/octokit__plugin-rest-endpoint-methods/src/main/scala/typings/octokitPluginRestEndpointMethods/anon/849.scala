package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsUpdateEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `849` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsUpdateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsUpdateResponseData]
}

object `849` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsUpdateResponseData]
  ): `849` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`849`]
  }
}

