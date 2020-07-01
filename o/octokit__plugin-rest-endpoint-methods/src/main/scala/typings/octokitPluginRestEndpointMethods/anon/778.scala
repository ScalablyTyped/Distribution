package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `778` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsGetMembershipForUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsGetMembershipForUserResponseData]
}

object `778` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsGetMembershipForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsGetMembershipForUserResponseData]
  ): `778` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`778`]
  }
}

