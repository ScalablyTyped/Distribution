package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsAddOrUpdateMembershipEndpoint
import typings.octokitTypes.endpointsMod.OrgsAddOrUpdateMembershipResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `766` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsAddOrUpdateMembershipEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsAddOrUpdateMembershipResponseData]
}

object `766` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsAddOrUpdateMembershipEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsAddOrUpdateMembershipResponseData]
  ): `766` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`766`]
  }
}

