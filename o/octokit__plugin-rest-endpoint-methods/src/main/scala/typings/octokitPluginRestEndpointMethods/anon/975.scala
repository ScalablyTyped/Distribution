package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListForOrgEndpoint
import typings.octokitTypes.endpointsMod.ReposListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `975` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListForOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListForOrgResponseData]
}

object `975` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListForOrgResponseData]
  ): `975` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`975`]
  }
}

