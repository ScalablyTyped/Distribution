package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `935` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetCommitSignatureProtectionResponseData]
}

object `935` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommitSignatureProtectionResponseData]
  ): `935` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`935`]
  }
}

