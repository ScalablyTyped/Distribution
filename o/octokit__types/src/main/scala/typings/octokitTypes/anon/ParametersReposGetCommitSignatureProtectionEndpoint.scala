package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetCommitSignatureProtectionEndpoint extends js.Object {
  var parameters: ReposGetCommitSignatureProtectionEndpoint
  var request: ReposGetCommitSignatureProtectionRequestOptions
  var response: OctokitResponse[ReposGetCommitSignatureProtectionResponseData]
}

object ParametersReposGetCommitSignatureProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetCommitSignatureProtectionEndpoint,
    request: ReposGetCommitSignatureProtectionRequestOptions,
    response: OctokitResponse[ReposGetCommitSignatureProtectionResponseData]
  ): ParametersReposGetCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitSignatureProtectionEndpoint]
  }
}

