package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `874` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposAddAppAccessRestrictionsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]
}

object `874` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposAddAppAccessRestrictionsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]
  ): `874` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`874`]
  }
}

