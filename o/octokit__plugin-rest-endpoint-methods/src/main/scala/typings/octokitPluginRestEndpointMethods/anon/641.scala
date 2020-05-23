package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksCreateEndpoint
import typings.octokitTypes.endpointsMod.ChecksCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `641` extends js.Object {
  var parameters: RequestParameters with (Omit[ChecksCreateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ChecksCreateResponseData]
}

object `641` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksCreateResponseData]
  ): `641` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`641`]
  }
}

