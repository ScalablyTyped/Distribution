package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsForkEndpoint
import typings.octokitTypes.endpointsMod.GistsForkResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `663` extends js.Object {
  var parameters: RequestParameters with (Omit[GistsForkEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GistsForkResponseData]
}

object `663` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsForkEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsForkResponseData]
  ): `663` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`663`]
  }
}

