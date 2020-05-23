package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `948` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetTeamsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]
}

object `948` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetTeamsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]
  ): `948` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`948`]
  }
}

