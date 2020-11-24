package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeRequestOptions
import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodesOfConductGetConductCodeEndpoint extends js.Object {
  
  var parameters: CodesOfConductGetConductCodeEndpoint = js.native
  
  var request: CodesOfConductGetConductCodeRequestOptions = js.native
  
  var response: OctokitResponse[CodesOfConductGetConductCodeResponseData] = js.native
}
object ParametersCodesOfConductGetConductCodeEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodesOfConductGetConductCodeEndpoint,
    request: CodesOfConductGetConductCodeRequestOptions,
    response: OctokitResponse[CodesOfConductGetConductCodeResponseData]
  ): ParametersCodesOfConductGetConductCodeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodesOfConductGetConductCodeEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodesOfConductGetConductCodeEndpointOps[Self <: ParametersCodesOfConductGetConductCodeEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: CodesOfConductGetConductCodeEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodesOfConductGetConductCodeRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodesOfConductGetConductCodeResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
