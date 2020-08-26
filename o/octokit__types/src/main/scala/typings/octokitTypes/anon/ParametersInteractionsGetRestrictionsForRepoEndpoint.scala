package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersInteractionsGetRestrictionsForRepoEndpoint extends js.Object {
  var parameters: InteractionsGetRestrictionsForRepoEndpoint = js.native
  var request: InteractionsGetRestrictionsForRepoRequestOptions = js.native
  var response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData] = js.native
}

object ParametersInteractionsGetRestrictionsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: InteractionsGetRestrictionsForRepoEndpoint,
    request: InteractionsGetRestrictionsForRepoRequestOptions,
    response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]
  ): ParametersInteractionsGetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsGetRestrictionsForRepoEndpoint]
  }
  @scala.inline
  implicit class ParametersInteractionsGetRestrictionsForRepoEndpointOps[Self <: ParametersInteractionsGetRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: InteractionsGetRestrictionsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: InteractionsGetRestrictionsForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

