package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetViewsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetViewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `960` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetViewsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetViewsResponseData]
}

object `960` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetViewsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetViewsResponseData]
  ): `960` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`960`]
  }
}

