package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsUnstarEndpoint
import typings.octokitTypes.endpointsMod.GistsUnstarRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsUnstarEndpoint extends js.Object {
  
  var parameters: GistsUnstarEndpoint = js.native
  
  var request: GistsUnstarRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersGistsUnstarEndpoint {
  
  @scala.inline
  def apply(parameters: GistsUnstarEndpoint, request: GistsUnstarRequestOptions, response: OctokitResponse[_]): ParametersGistsUnstarEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsUnstarEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsUnstarEndpointOps[Self <: ParametersGistsUnstarEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GistsUnstarEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsUnstarRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
