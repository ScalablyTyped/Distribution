package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `878` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]
}

object `878` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]
  ): `878` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`878`]
  }
}

