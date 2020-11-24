package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateFromManifestEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsCreateFromManifestEndpoint extends js.Object {
  
  var parameters: AppsCreateFromManifestEndpoint = js.native
  
  var request: AppsCreateFromManifestRequestOptions = js.native
  
  var response: OctokitResponse[AppsCreateFromManifestResponseData] = js.native
}
object ParametersAppsCreateFromManifestEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsCreateFromManifestEndpoint,
    request: AppsCreateFromManifestRequestOptions,
    response: OctokitResponse[AppsCreateFromManifestResponseData]
  ): ParametersAppsCreateFromManifestEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateFromManifestEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsCreateFromManifestEndpointOps[Self <: ParametersAppsCreateFromManifestEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsCreateFromManifestEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsCreateFromManifestRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateFromManifestResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
