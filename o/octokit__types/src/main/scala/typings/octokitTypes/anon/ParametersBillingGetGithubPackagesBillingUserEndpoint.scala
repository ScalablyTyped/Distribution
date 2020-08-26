package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingUserEndpoint
import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingUserRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersBillingGetGithubPackagesBillingUserEndpoint extends js.Object {
  var parameters: BillingGetGithubPackagesBillingUserEndpoint = js.native
  var request: BillingGetGithubPackagesBillingUserRequestOptions = js.native
  var response: OctokitResponse[BillingGetGithubPackagesBillingUserResponseData] = js.native
}

object ParametersBillingGetGithubPackagesBillingUserEndpoint {
  @scala.inline
  def apply(
    parameters: BillingGetGithubPackagesBillingUserEndpoint,
    request: BillingGetGithubPackagesBillingUserRequestOptions,
    response: OctokitResponse[BillingGetGithubPackagesBillingUserResponseData]
  ): ParametersBillingGetGithubPackagesBillingUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetGithubPackagesBillingUserEndpoint]
  }
  @scala.inline
  implicit class ParametersBillingGetGithubPackagesBillingUserEndpointOps[Self <: ParametersBillingGetGithubPackagesBillingUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: BillingGetGithubPackagesBillingUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: BillingGetGithubPackagesBillingUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubPackagesBillingUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

