package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetReadmeEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReadmeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `952` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetReadmeEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetReadmeResponseData]
}

object `952` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetReadmeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetReadmeResponseData]
  ): `952` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`952`]
  }
}

