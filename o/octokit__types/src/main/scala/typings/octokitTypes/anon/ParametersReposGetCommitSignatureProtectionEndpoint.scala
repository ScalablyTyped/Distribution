package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetCommitSignatureProtectionEndpoint extends js.Object {
  var parameters: ReposGetCommitSignatureProtectionEndpoint = js.native
  var request: ReposGetCommitSignatureProtectionRequestOptions = js.native
  var response: OctokitResponse[ReposGetCommitSignatureProtectionResponseData] = js.native
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
  @scala.inline
  implicit class ParametersReposGetCommitSignatureProtectionEndpointOps[Self <: ParametersReposGetCommitSignatureProtectionEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: ReposGetCommitSignatureProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetCommitSignatureProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommitSignatureProtectionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

