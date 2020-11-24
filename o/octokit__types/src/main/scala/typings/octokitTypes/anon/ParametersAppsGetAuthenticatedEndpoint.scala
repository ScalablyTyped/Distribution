package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetAuthenticatedEndpoint extends js.Object {
  
  var parameters: AppsGetAuthenticatedEndpoint = js.native
  
  var request: AppsGetAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetAuthenticatedResponseData] = js.native
}
object ParametersAppsGetAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetAuthenticatedEndpoint,
    request: AppsGetAuthenticatedRequestOptions,
    response: OctokitResponse[AppsGetAuthenticatedResponseData]
  ): ParametersAppsGetAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetAuthenticatedEndpointOps[Self <: ParametersAppsGetAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsGetAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
