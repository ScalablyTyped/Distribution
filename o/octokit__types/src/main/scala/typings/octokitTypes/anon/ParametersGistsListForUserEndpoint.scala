package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsListForUserEndpoint
import typings.octokitTypes.endpointsMod.GistsListForUserRequestOptions
import typings.octokitTypes.endpointsMod.GistsListForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsListForUserEndpoint extends js.Object {
  
  var parameters: GistsListForUserEndpoint = js.native
  
  var request: GistsListForUserRequestOptions = js.native
  
  var response: OctokitResponse[GistsListForUserResponseData] = js.native
}
object ParametersGistsListForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListForUserEndpoint,
    request: GistsListForUserRequestOptions,
    response: OctokitResponse[GistsListForUserResponseData]
  ): ParametersGistsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListForUserEndpointOps[Self <: ParametersGistsListForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GistsListForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
