package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `779` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsGetMembershipForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]
}

object `779` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsGetMembershipForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]
  ): `779` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`779`]
  }
}

