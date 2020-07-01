package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `990` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposRemoveAppAccessRestrictionsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]
}

object `990` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposRemoveAppAccessRestrictionsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]
  ): `990` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`990`]
  }
}

