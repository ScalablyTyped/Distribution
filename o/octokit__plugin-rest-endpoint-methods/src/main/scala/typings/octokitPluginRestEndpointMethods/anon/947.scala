package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `947` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetPagesBuildEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetPagesBuildResponseData]
}

object `947` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetPagesBuildEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetPagesBuildResponseData]
  ): `947` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`947`]
  }
}

