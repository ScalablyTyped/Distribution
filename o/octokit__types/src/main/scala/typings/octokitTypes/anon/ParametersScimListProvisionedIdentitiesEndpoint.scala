package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesEndpoint
import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesRequestOptions
import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersScimListProvisionedIdentitiesEndpoint extends js.Object {
  var parameters: ScimListProvisionedIdentitiesEndpoint = js.native
  var request: ScimListProvisionedIdentitiesRequestOptions = js.native
  var response: OctokitResponse[ScimListProvisionedIdentitiesResponseData] = js.native
}

object ParametersScimListProvisionedIdentitiesEndpoint {
  @scala.inline
  def apply(
    parameters: ScimListProvisionedIdentitiesEndpoint,
    request: ScimListProvisionedIdentitiesRequestOptions,
    response: OctokitResponse[ScimListProvisionedIdentitiesResponseData]
  ): ParametersScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimListProvisionedIdentitiesEndpoint]
  }
  @scala.inline
  implicit class ParametersScimListProvisionedIdentitiesEndpointOps[Self <: ParametersScimListProvisionedIdentitiesEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ScimListProvisionedIdentitiesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ScimListProvisionedIdentitiesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ScimListProvisionedIdentitiesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

