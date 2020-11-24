package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MetaGetEndpoint
import typings.octokitTypes.endpointsMod.MetaGetRequestOptions
import typings.octokitTypes.endpointsMod.MetaGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMetaGetEndpoint extends js.Object {
  
  var parameters: MetaGetEndpoint = js.native
  
  var request: MetaGetRequestOptions = js.native
  
  var response: OctokitResponse[MetaGetResponseData] = js.native
}
object ParametersMetaGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: MetaGetEndpoint,
    request: MetaGetRequestOptions,
    response: OctokitResponse[MetaGetResponseData]
  ): ParametersMetaGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMetaGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMetaGetEndpointOps[Self <: ParametersMetaGetEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: MetaGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MetaGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MetaGetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
