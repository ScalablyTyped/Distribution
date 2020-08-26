package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingGheEndpoint
import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersBillingGetGithubPackagesBillingGheEndpoint extends js.Object {
  var parameters: BillingGetGithubPackagesBillingGheEndpoint = js.native
  var request: BillingGetGithubPackagesBillingGheRequestOptions = js.native
  var response: OctokitResponse[BillingGetGithubPackagesBillingGheResponseData] = js.native
}

object ParametersBillingGetGithubPackagesBillingGheEndpoint {
  @scala.inline
  def apply(
    parameters: BillingGetGithubPackagesBillingGheEndpoint,
    request: BillingGetGithubPackagesBillingGheRequestOptions,
    response: OctokitResponse[BillingGetGithubPackagesBillingGheResponseData]
  ): ParametersBillingGetGithubPackagesBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetGithubPackagesBillingGheEndpoint]
  }
  @scala.inline
  implicit class ParametersBillingGetGithubPackagesBillingGheEndpointOps[Self <: ParametersBillingGetGithubPackagesBillingGheEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: BillingGetGithubPackagesBillingGheEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: BillingGetGithubPackagesBillingGheRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubPackagesBillingGheResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

