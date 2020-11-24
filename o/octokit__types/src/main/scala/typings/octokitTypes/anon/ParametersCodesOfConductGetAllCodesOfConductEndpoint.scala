package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductRequestOptions
import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodesOfConductGetAllCodesOfConductEndpoint extends js.Object {
  
  var parameters: CodesOfConductGetAllCodesOfConductEndpoint = js.native
  
  var request: CodesOfConductGetAllCodesOfConductRequestOptions = js.native
  
  var response: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData] = js.native
}
object ParametersCodesOfConductGetAllCodesOfConductEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodesOfConductGetAllCodesOfConductEndpoint,
    request: CodesOfConductGetAllCodesOfConductRequestOptions,
    response: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]
  ): ParametersCodesOfConductGetAllCodesOfConductEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodesOfConductGetAllCodesOfConductEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodesOfConductGetAllCodesOfConductEndpointOps[Self <: ParametersCodesOfConductGetAllCodesOfConductEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: CodesOfConductGetAllCodesOfConductEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodesOfConductGetAllCodesOfConductRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
