package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `539` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsCreateRegistrationTokenForOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsCreateRegistrationTokenForOrgResponseData]
}

object `539` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsCreateRegistrationTokenForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsCreateRegistrationTokenForOrgResponseData]
  ): `539` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`539`]
  }
}

