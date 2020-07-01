package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteCommitSignatureProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteCommitSignatureProtectionEndpoint extends js.Object {
  var parameters: ReposDeleteCommitSignatureProtectionEndpoint
  var request: ReposDeleteCommitSignatureProtectionRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteCommitSignatureProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteCommitSignatureProtectionEndpoint,
    request: ReposDeleteCommitSignatureProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteCommitSignatureProtectionEndpoint]
  }
}

