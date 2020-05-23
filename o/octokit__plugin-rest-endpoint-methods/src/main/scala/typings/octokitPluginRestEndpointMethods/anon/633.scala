package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsListPlansEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `633` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsListPlansEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsListPlansResponseData]
}

object `633` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListPlansEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListPlansResponseData]
  ): `633` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`633`]
  }
}

