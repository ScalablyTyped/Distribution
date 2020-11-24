package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EmojisGetEndpoint
import typings.octokitTypes.endpointsMod.EmojisGetRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEmojisGetEndpoint extends js.Object {
  
  var parameters: EmojisGetEndpoint = js.native
  
  var request: EmojisGetRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersEmojisGetEndpoint {
  
  @scala.inline
  def apply(parameters: EmojisGetEndpoint, request: EmojisGetRequestOptions, response: OctokitResponse[_]): ParametersEmojisGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEmojisGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEmojisGetEndpointOps[Self <: ParametersEmojisGetEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EmojisGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EmojisGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
