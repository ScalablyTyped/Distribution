package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateCommitSignatureProtectionEndpoint extends js.Object {
  var parameters: ReposCreateCommitSignatureProtectionEndpoint
  var request: ReposCreateCommitSignatureProtectionRequestOptions
  var response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]
}

object ParametersReposCreateCommitSignatureProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateCommitSignatureProtectionEndpoint,
    request: ReposCreateCommitSignatureProtectionRequestOptions,
    response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]
  ): ParametersReposCreateCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateCommitSignatureProtectionEndpoint]
  }
}

