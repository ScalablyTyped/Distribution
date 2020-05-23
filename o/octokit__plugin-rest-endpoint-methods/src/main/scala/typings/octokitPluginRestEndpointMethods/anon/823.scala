package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsUpdateEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `823` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsUpdateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsUpdateResponseData]
}

object `823` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsUpdateResponseData]
  ): `823` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`823`]
  }
}

