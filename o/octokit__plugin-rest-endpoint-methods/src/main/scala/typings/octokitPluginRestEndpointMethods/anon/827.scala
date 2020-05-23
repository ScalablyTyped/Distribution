package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsCreateEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `827` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsCreateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsCreateResponseData]
}

object `827` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateResponseData]
  ): `827` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`827`]
  }
}

