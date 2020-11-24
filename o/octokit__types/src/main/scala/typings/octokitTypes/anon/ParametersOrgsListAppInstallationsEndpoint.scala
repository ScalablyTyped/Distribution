package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListAppInstallationsEndpoint extends js.Object {
  
  var parameters: OrgsListAppInstallationsEndpoint = js.native
  
  var request: OrgsListAppInstallationsRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListAppInstallationsResponseData] = js.native
}
object ParametersOrgsListAppInstallationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListAppInstallationsEndpoint,
    request: OrgsListAppInstallationsRequestOptions,
    response: OctokitResponse[OrgsListAppInstallationsResponseData]
  ): ParametersOrgsListAppInstallationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListAppInstallationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListAppInstallationsEndpointOps[Self <: ParametersOrgsListAppInstallationsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsListAppInstallationsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListAppInstallationsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListAppInstallationsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
