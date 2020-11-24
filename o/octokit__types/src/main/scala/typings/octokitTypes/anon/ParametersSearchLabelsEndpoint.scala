package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchLabelsEndpoint
import typings.octokitTypes.endpointsMod.SearchLabelsRequestOptions
import typings.octokitTypes.endpointsMod.SearchLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchLabelsEndpoint extends js.Object {
  
  var parameters: SearchLabelsEndpoint = js.native
  
  var request: SearchLabelsRequestOptions = js.native
  
  var response: OctokitResponse[SearchLabelsResponseData] = js.native
}
object ParametersSearchLabelsEndpoint {
  
  @scala.inline
  def apply(
    parameters: SearchLabelsEndpoint,
    request: SearchLabelsRequestOptions,
    response: OctokitResponse[SearchLabelsResponseData]
  ): ParametersSearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchLabelsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchLabelsEndpointOps[Self <: ParametersSearchLabelsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: SearchLabelsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: SearchLabelsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchLabelsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
