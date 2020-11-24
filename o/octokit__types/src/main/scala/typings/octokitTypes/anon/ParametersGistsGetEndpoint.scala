package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsGetEndpoint
import typings.octokitTypes.endpointsMod.GistsGetRequestOptions
import typings.octokitTypes.endpointsMod.GistsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsGetEndpoint extends js.Object {
  
  var parameters: GistsGetEndpoint = js.native
  
  var request: GistsGetRequestOptions = js.native
  
  var response: OctokitResponse[GistsGetResponseData] = js.native
}
object ParametersGistsGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsGetEndpoint,
    request: GistsGetRequestOptions,
    response: OctokitResponse[GistsGetResponseData]
  ): ParametersGistsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsGetEndpointOps[Self <: ParametersGistsGetEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GistsGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsGetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
