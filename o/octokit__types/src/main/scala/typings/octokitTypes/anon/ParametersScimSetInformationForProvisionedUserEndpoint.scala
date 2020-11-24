package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserEndpoint
import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimSetInformationForProvisionedUserEndpoint extends js.Object {
  
  var parameters: ScimSetInformationForProvisionedUserEndpoint = js.native
  
  var request: ScimSetInformationForProvisionedUserRequestOptions = js.native
  
  var response: OctokitResponse[ScimSetInformationForProvisionedUserResponseData] = js.native
}
object ParametersScimSetInformationForProvisionedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimSetInformationForProvisionedUserEndpoint,
    request: ScimSetInformationForProvisionedUserRequestOptions,
    response: OctokitResponse[ScimSetInformationForProvisionedUserResponseData]
  ): ParametersScimSetInformationForProvisionedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimSetInformationForProvisionedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimSetInformationForProvisionedUserEndpointOps[Self <: ParametersScimSetInformationForProvisionedUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ScimSetInformationForProvisionedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimSetInformationForProvisionedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimSetInformationForProvisionedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
