package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsGetCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `811` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsGetCardEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsGetCardResponseData]
}

object `811` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsGetCardEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsGetCardResponseData]
  ): `811` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`811`]
  }
}

