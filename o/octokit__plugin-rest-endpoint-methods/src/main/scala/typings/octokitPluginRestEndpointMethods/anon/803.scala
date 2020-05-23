package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsCreateColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `803` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsCreateColumnEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsCreateColumnResponseData]
}

object `803` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsCreateColumnEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsCreateColumnResponseData]
  ): `803` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`803`]
  }
}

