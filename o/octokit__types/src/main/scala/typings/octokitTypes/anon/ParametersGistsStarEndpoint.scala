package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsStarEndpoint
import typings.octokitTypes.endpointsMod.GistsStarRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsStarEndpoint extends js.Object {
  
  var parameters: GistsStarEndpoint = js.native
  
  var request: GistsStarRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersGistsStarEndpoint {
  
  @scala.inline
  def apply(parameters: GistsStarEndpoint, request: GistsStarRequestOptions, response: OctokitResponse[_]): ParametersGistsStarEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsStarEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsStarEndpointOps[Self <: ParametersGistsStarEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GistsStarEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsStarRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
